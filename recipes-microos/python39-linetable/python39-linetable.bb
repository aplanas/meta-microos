SUMMARY = "library to manage Python Locations Table (co_linetable)"
DESCRIPTION = "library to manage Python Locations Table (co_linetable)"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python39-linetable-0.0.3-1.2.noarch.rpm"
RPM_HASH = "5d94512b6fd64d3451bc82d915ea09b5f8f09241c5ec0c2e4f11044bc0edbddde382964a8c4e0f890423c1dab5d3ef568b7d79d601096df13d158c88ef04307d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(linetable) python39-linetable python3dist(linetable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
