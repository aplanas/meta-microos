SUMMARY = "Utilities jointly used by devpi-server and devpi-client"
DESCRIPTION = "Utilities jointly used by devpi-server and devpi-client."
LICENSE = "MIT"

PV = "3.7.2"

RPM_NAME = "python39-devpi-common-3.7.2-2.2.noarch.rpm"
RPM_HASH = "dc32f7e4b0a75550ca5572be8fcb3b4311d3bd5c8b8827a0ffff119ee2fbceec3cd7113ca43e3fb595a236db83ebbf82ea1281fa375d1bd5c96db18ab31d24e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(devpi-common) python39-devpi-common python3dist(devpi-common)"
RDEPENDS:${PN} += "python(abi) python39-packaging python39-py python39-requests"

inherit rpm
