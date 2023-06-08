SUMMARY = "The official unofficial pip API"
DESCRIPTION = "The official unofficial pip API."
LICENSE = "Apache-2.0"

PV = "0.0.30"

RPM_NAME = "python310-pip-api-0.0.30-1.3.noarch.rpm"
RPM_HASH = "cbd5cc6892188cc35489d0d8b46b3b75e2df4801e8e5858293fc3d452396a5f4018d3bbb9b88f8825ed36b929281778b1baad40453adde67d8d13586370b00a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-api python3.10dist(pip-api) python310-pip-api python3dist(pip-api)"
RDEPENDS:${PN} += "python(abi) python310-pip"

inherit rpm
