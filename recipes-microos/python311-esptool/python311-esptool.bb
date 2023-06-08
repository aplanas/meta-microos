SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "python311-esptool-3.3.2-1.5.noarch.rpm"
RPM_HASH = "de62e36192aeb89dc7f58b27519ad66bad1e88bcb302df500cbb20cd9c96bf1b783bd977856f898721333d71ad585ec268db9ab84a8a92764398dba048d944ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(esptool) python311-esptool python3dist(esptool)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-ecdsa python311-pyaes python311-pyserial update-alternatives"

inherit rpm
