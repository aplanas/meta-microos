SUMMARY = "Python poetry core utilities"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "1.5.2"

RPM_NAME = "python39-poetry-core-1.5.2-1.1.noarch.rpm"
RPM_HASH = "0fa36a6b6674a5a6419c62088f400b1acb91761c36e5c0099a0e0def01b2615e458336292265f608806147999c1a8dfabe13e29194800024ff0dba63eb306275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(poetry-core) python39-poetry-core python3dist(poetry-core)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
