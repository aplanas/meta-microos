SUMMARY = "Automatic generated to pep8 checked code"
DESCRIPTION = "Autopep8 is automatic generated to pep8 checked code. \
This is old style tool, wrapped pep8 via subprocess module."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-autopep8-2.0.2-1.2.noarch.rpm"
RPM_HASH = "b6846690af1f660ec998db0c9e0624bb5f62900235fc68e54376c13c2ab94dea02aec2785f740b67584693f14f239e8bc515c981d8e55ee7663ed7114adee414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(autopep8) python39-autopep8 python3dist(autopep8)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-pycodestyle python39-tomli update-alternatives"

inherit rpm
