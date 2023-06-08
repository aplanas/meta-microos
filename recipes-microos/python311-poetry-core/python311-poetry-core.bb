SUMMARY = "Python poetry core utilities"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "1.5.2"

RPM_NAME = "python311-poetry-core-1.5.2-1.1.noarch.rpm"
RPM_HASH = "2763be296f2c9c5af56eae3e7d72f8dafc81b163c2d7c1ea40dd4b52c51b1d97a4a9506887f002530def01ea7a683b8872289f72f2076c856cc78d37bb50b745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(poetry-core) python311-poetry-core python3dist(poetry-core)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
