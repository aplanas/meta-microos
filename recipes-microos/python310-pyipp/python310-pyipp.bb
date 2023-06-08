SUMMARY = "Asynchronous Python client for Internet Printing Protocol (IPP)"
DESCRIPTION = "Asynchronous Python client for Internet Printing Protocol (IPP)."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-pyipp-0.11.0-1.9.noarch.rpm"
RPM_HASH = "a707b072900ec0bed73b0f53c94ab60aeca5d4159b348886a79f0582503303733e69d76720d365b01202f9d856b36485d09ff6902870aa2542865d6e07eebbca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyipp python3.10dist(pyipp) python310-pyipp python3dist(pyipp)"
RDEPENDS:${PN} += "python(abi) python310-aiohttp python310-deepmerge python310-yarl"

inherit rpm
