SUMMARY = "Firefox Accounts client library for Python"
DESCRIPTION = "This is python library for interacting with the Firefox Accounts ecosystem."
LICENSE = "MPL-2.0"

PV = "0.7.7"

RPM_NAME = "python311-PyFxA-0.7.7-3.7.noarch.rpm"
RPM_HASH = "d755aa152431e4fdfb19fab806ed45fb929d09136a869bd5dc63af8563a260c2dcd158af1a0f52ebbf9e6236f126459699d4fe2a80b306a5a57ce3ba11852c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyfxa) \
python311-PyFxA \
python3dist(pyfxa)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyBrowserID \
python311-cryptography \
python311-requests \
python311-six \
update-alternatives"

inherit rpm
