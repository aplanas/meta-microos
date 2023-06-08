SUMMARY = "Promises/A+ implementation for Python"
DESCRIPTION = "This is an implementation of Promises in Python"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-promise-2.3.0-3.3.noarch.rpm"
RPM_HASH = "c237cabf09910c8050be129a3c9adfb3030c2d294b84485bee8a4da80652e72a7d96390443a8fcc95a0e942219931d65ead8f1a130ad215f256e06e09beeab6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(promise) python311-promise python3dist(promise)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
