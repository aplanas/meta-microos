SUMMARY = "Python poetry core utilities"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "1.5.2"

RPM_NAME = "python310-poetry-core-1.5.2-1.1.noarch.rpm"
RPM_HASH = "b8eaf20f6010408585f79e366d71ce2015f259a34710aae909008eab8f7d4125e9b2af4ef98466fda2bd41537981f80650f9ab98e42073cd98bf3e1ebac7af11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry-core python3.10dist(poetry-core) python310-poetry-core python3dist(poetry-core)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
