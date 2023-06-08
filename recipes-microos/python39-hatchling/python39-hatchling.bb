SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python39-hatchling-1.14.1-1.1.noarch.rpm"
RPM_HASH = "e3eb4cef7b9282d236c219ab8d0c4b792b1b98c81a6a65815558ce5049c19bfe19fb3c0a6aa99702319813da18e10b85e87c54969323a0b877c6f00efba5cdfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hatchling) python39-hatchling python3dist(hatchling)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-editables python39-packaging python39-pathspec python39-pluggy python39-tomli python39-trove-classifiers update-alternatives"

inherit rpm
