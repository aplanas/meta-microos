SUMMARY = "Pass backend for python-keyring"
DESCRIPTION = "python-keyring backend getting data from pass."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-keyring-pass-0.7.1-1.3.noarch.rpm"
RPM_HASH = "22ad2803cb7357c6c5fc97b69f3ddcfa140a918a080f14000b0d3c84ca1b1dcd56bb21c31d8d900b3b515fdfecb387e5e71c03652eed13418765c2ddb3e2ff07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(keyring-pass) python311-keyring-pass python3dist(keyring-pass)"
RDEPENDS:${PN} += "python(abi) python311-jaraco.classes python311-keyring"

inherit rpm
