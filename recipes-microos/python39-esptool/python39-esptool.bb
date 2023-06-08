SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "python39-esptool-3.3.2-1.5.noarch.rpm"
RPM_HASH = "75a129134095a4bd3eeec99421eebde7b3886d73ace85f424254301f3a5cfc9a997a7eeb20be5720bb335b71eeaa4ad69e9b0a8b8d63b62dced32e309e180a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(esptool) python39-esptool python3dist(esptool)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-ecdsa python39-pyaes python39-pyserial update-alternatives"

inherit rpm
