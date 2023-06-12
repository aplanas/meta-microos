SUMMARY = "Firefox Accounts client library for Python"
DESCRIPTION = "This is python library for interacting with the Firefox Accounts ecosystem."
LICENSE = "MPL-2.0"

PV = "0.7.7"

RPM_NAME = "python39-PyFxA-0.7.7-3.7.noarch.rpm"
RPM_HASH = "fe5a423133e0ffdf506b00dc76b1f78bd19e6573605d6cc6af261cb57bb35c46d15e9ab2a6f5fc4b98013e1973b553212e739dc332429a9537768e96f07902be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyfxa) \
python39-PyFxA \
python3dist(pyfxa)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyBrowserID \
python39-cryptography \
python39-requests \
python39-six \
update-alternatives"

inherit rpm
