SUMMARY = "Python 3 module to generate QR Codes"
DESCRIPTION = "The PyQRCode module is a QR code generator that is simple to use and written in pure python. The module can automates most of the building process for creating QR codes. Most codes can be created using only two lines of code!"
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python311-PyQRCode-1.3.6-3.11.noarch.rpm"
RPM_HASH = "95381a7e82362a34288322f452e14dc9b7539a7c0827f8b0f5468631b0814fc8f09c891aed3affffe707894b0df58597eda07fcf10ef95979d39786de97d5e6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyqrcodeng) python311-PyQRCode python3dist(pyqrcodeng)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
