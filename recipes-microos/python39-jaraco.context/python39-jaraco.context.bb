SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python39-jaraco.context-4.3.0-1.1.noarch.rpm"
RPM_HASH = "230b0af41d69f0b3625ad760e486e7fee0d583f9e24bd92346580470e29996dc77595989ffd75170d3316ba29e7ea92e28e8c9fec88a839082bfe28868741590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.context) python39-jaraco.context python3dist(jaraco.context)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
