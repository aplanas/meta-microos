SUMMARY = "ASDF coordinates schemas"
DESCRIPTION = "ASDF coordinates schemas"
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python39-asdf-coordinates-schemas-0.1.0-1.7.noarch.rpm"
RPM_HASH = "2a6d3d74954fccf3f61d6802cfde7787805c8f74b9bb99d673b8a92b836523007a7061631fa6674060ed27217d00d7e6441c9d3b7b17d9c0888baf79eb3290f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asdf-coordinates-schemas) \
python39-asdf-coordinates-schemas \
python3dist(asdf-coordinates-schemas)"
RDEPENDS:${PN} += "python(abi) \
python39-asdf"

inherit rpm
