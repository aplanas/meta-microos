SUMMARY = "Python 3 module to generate QR Codes"
DESCRIPTION = "The PyQRCode module is a QR code generator that is simple to use and written in pure python. The module can automates most of the building process for creating QR codes. Most codes can be created using only two lines of code!"
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python310-PyQRCode-1.3.6-3.11.noarch.rpm"
RPM_HASH = "f2681f0989b182eb2c185188805a4b4e86ebb70c7684d4cc366f269548bb9eecfcd18205380f8a014a75ba85b6fbd78328466d28186a3d1065219fe5d262c1cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQRCode python3.10dist(pyqrcodeng) python310-PyQRCode python3dist(pyqrcodeng)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
