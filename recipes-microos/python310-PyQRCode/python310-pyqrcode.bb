SUMMARY = "Python 3 module to generate QR Codes"
DESCRIPTION = "The PyQRCode module is a QR code generator that is simple to use and written in pure python. \
The module can automates most of the building process for creating QR codes. \
Most codes can be created using only two lines of code."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python310-PyQRCode-1.3.6-4.1.noarch.rpm"
RPM_HASH = "cfc669ca1f55096f96d702afc1a1cd1761d992bc52476d0fc558934f89ec588f28a117bee19e04a8aad1834b174c2fc758c2d454a81f2476cf36d22700e6edfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQRCode \
python3-PyQRCodeNG \
python3-pyqrcodeng \
python3.10dist(pyqrcodeng) \
python310-PyQRCode \
python310-PyQRCodeNG \
python310-pyqrcodeng \
python3dist(pyqrcodeng)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
