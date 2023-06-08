SUMMARY = "Python 3 module to generate QR Codes"
DESCRIPTION = "The PyQRCode module is a QR code generator that is simple to use and written in pure python. The module can automates most of the building process for creating QR codes. Most codes can be created using only two lines of code!"
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python39-PyQRCode-1.3.6-3.11.noarch.rpm"
RPM_HASH = "4125be45f9b72eb582208bdde846d721210d6e95bbbed99935c77b183af242c69a5343b0566b89c495eea688c00f25f373b76b175bd780150c74f3f7009adbef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyqrcodeng) python39-PyQRCode python3dist(pyqrcodeng)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
