SUMMARY = "Implements a topological sort algorithm"
DESCRIPTION = "Implements a topological sort algorithm."
LICENSE = "Apache-2.0"

PV = "1.7"

RPM_NAME = "python39-toposort-1.7-1.14.noarch.rpm"
RPM_HASH = "7c69335154c3e631150aef835f7a2624665b6960f3a9b2d317bb631d812405be239850828a9e11041afd733e731445db3f5d8ef36b58a9e8fb6aea6f60c6f1c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(toposort) \
python39-toposort \
python3dist(toposort)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
