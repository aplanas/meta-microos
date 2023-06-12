SUMMARY = "Python 3 module to generate QR Codes"
DESCRIPTION = "The PyQRCode module is a QR code generator that is simple to use and written in pure python. \
The module can automates most of the building process for creating QR codes. \
Most codes can be created using only two lines of code."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python39-PyQRCode-1.3.6-4.1.noarch.rpm"
RPM_HASH = "ba935469c04f215bc478547b37a1bbcf0211598cfa5c13a2f72d08d8335fab4ad86a068f2a153f932b9fd10034009d3fd30478be0c2f075112b9a49ca3b351ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyqrcodeng) python39-PyQRCode python39-PyQRCodeNG python39-pyqrcodeng python3dist(pyqrcodeng)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
