SUMMARY = "Parsing, validation and query functions for packaging metadata"
DESCRIPTION = "Python module for parsing, validating and querying distribution/packaging \
metadata stored in human readable and reviewable text/YAML files."
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "python310-distroinfo-0.6.2-1.2.noarch.rpm"
RPM_HASH = "127ca08d954fafc07262cdd2056ea1c463449987e986d3116660c33544c6024fee4da271a1d144868a3701b26d9208cd2e8cb0f0fce6a5ae35b8257627cf595d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distroinfo python3.10dist(distroinfo) python310-distroinfo python3dist(distroinfo)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML python310-pbr python310-requests python310-six"

inherit rpm
