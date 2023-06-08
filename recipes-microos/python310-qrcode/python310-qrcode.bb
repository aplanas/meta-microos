SUMMARY = "QR Code image generator"
DESCRIPTION = "This module uses the Python Imaging Library (PIL) to allow for the generation \
of QR Codes."
LICENSE = "BSD-3-Clause"

PV = "7.3.1"

RPM_NAME = "python310-qrcode-7.3.1-2.7.noarch.rpm"
RPM_HASH = "0e3840ab4cefb7ec7c35c3f34f5eee8722e5b7ac0e65b86f08ee4eecf9b05b6d49b744b7f55c30e481d3c164ad05f472a8d903be029c034a5f754d79ca48f4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qrcode python3.10dist(qrcode) python310-qrcode python3dist(qrcode)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-setuptools update-alternatives"

inherit rpm
