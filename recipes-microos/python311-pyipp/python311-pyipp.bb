SUMMARY = "Asynchronous Python client for Internet Printing Protocol (IPP)"
DESCRIPTION = "Asynchronous Python client for Internet Printing Protocol (IPP)."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-pyipp-0.11.0-1.9.noarch.rpm"
RPM_HASH = "14772a3aabdd4408f2511d7c66da38d8d5ebc5d4bcb964561561c83282f82054ffe12d561bf17630a26cc457a3397145cb9ead1ea999d2ccc97d529dd3ad2fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyipp) \
python311-pyipp \
python3dist(pyipp)"
RDEPENDS:${PN} += "python(abi) \
python311-aiohttp \
python311-deepmerge \
python311-yarl"

inherit rpm
