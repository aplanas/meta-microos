SUMMARY = "Poetry PEP 517 Build Backend"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "1.6.1"

RPM_NAME = "python39-poetry-core-1.6.1-1.1.noarch.rpm"
RPM_HASH = "48fa781d924645b92de64deac642ddd01de882f0fc16fe2cf3df395662b1318c2dc3fe4417a6d58cc2dc77bb973124537375e770149ab9e810952807477a589a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(poetry-core) \
python39-poetry-core \
python3dist(poetry-core)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
