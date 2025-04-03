import os
import requests
from dotenv import load_dotenv
from pathlib import Path

load_dotenv()

URL_BASE = os.getenv("URL_BASE", "http://localhost:8081") # Obtener ruta de la API desde .env
FILE_NAME = os.getenv("FILE_NAME", "Enemigos.txt") # Obtener nombre del archivo desde .env
URL_ENEMIGOS = f"{URL_BASE}/enemigos"
URL_TROPAS = f"{URL_BASE}/tropas"
descargas = Path.home() / "Descargas"
if not descargas.exists():
    descargas = Path.home() / "Downloads"

archivo = descargas / FILE_NAME

try:
    with open(archivo, "r", encoding="utf-8") as f:
        next(f)  # Saltar linea del encabezado
        for i, linea in enumerate(f, start=2):
            if not linea.strip():
                continue

            datos = linea.strip().split("|")
            if len(datos) != 7:
                print(f"Linea {i+1} mal formada: {linea}")
                continue

            potencia, hostilidad, ubicacion, frente, numero_tropas, tipo_tropas, hora_despliegue = datos

            enemigo_payload = {
                "potencia": potencia,
                "hostilidad": hostilidad,
                "ubicacion": ubicacion
            }

            r1 = requests.post(URL_ENEMIGOS, json=enemigo_payload)
            if r1.ok:
                print(f"SUCC. Enemigo enviado: {enemigo_payload}")
            else:
                print(f"ERR. Error enviando a /enemigos: {r1.status_code} - {r1.text}")

            tropas_payload = {
                "potencia": potencia,
                "frente": frente,
                "numeroTropas": int(numero_tropas),
                "tipoTropas": tipo_tropas,
                "horaDespliegue": hora_despliegue.strip()
            }

            r2 = requests.post(URL_TROPAS, json=tropas_payload)
            if r2.ok:
                print(f"SUCC. Tropas enviadas: {tropas_payload}")
            else:
                print(f"ERR. Error enviando a /tropas: {r2.status_code} - {r2.text}")

except FileNotFoundError:
    print(f"ERR. Archivo no encontrado: {archivo}")