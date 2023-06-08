SUMMARY = "A Python wrapper library for subprocess module"
DESCRIPTION = "A Python wrapper library for subprocess module."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-subprocrunner-2.0.0-2.3.noarch.rpm"
RPM_HASH = "d4a8911267d9183cb4c3b5dc4a3d47128e59e0bfcbee11797c88baf053ec0e7447a30c8638fab252267757f4e05f4ed77655b84dedc4e2713e007aa36017b8f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(subprocrunner) python311-subprocrunner python3dist(subprocrunner)"
RDEPENDS:${PN} += "python(abi) python311-loguru python311-mbstrdecoder python311-typepy"

inherit rpm
