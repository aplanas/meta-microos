SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python310-hatchling-1.17.0-1.1.noarch.rpm"
RPM_HASH = "4882bf94d8cff3fe195ef926e75c7f30d6684423a51c22fc66b2eef4d1bc231352904e0ac468ee12d89d783ad076ed0f8dbaa8caa69e83690453edf47f2584ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatchling python3.10dist(hatchling) python310-hatchling python3dist(hatchling)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-editables python310-packaging python310-pathspec python310-pluggy python310-tomli python310-trove-classifiers update-alternatives"

inherit rpm
