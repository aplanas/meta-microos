SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "python39-esptool-4.5.1-1.1.noarch.rpm"
RPM_HASH = "fda4e8e7ae4e6a3081fa3d7bacea7ea73061c1dc623e00ddc54b31821863a889987547aa4a7bcc4339b2b222c72ecf32fe0257d2fc54f4e1d3eeb0f9b582a69c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(esptool) \
python39-esptool \
python3dist(esptool)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-ecdsa \
python39-pyaes \
python39-pyserial \
update-alternatives"

inherit rpm
