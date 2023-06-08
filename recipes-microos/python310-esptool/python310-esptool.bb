SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "python310-esptool-3.3.2-1.5.noarch.rpm"
RPM_HASH = "ab44ac338596a9c698e8d2a21503519ba44be839908ccf26e59f086f03f50deda01a748470fc8446bdc3239028f460b59706886661dda5e9044bba3a48520a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-esptool python3.10dist(esptool) python310-esptool python3dist(esptool)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-ecdsa python310-pyaes python310-pyserial update-alternatives"

inherit rpm
