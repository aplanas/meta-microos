SUMMARY = "Extends the python-rich library functionality"
DESCRIPTION = "Extends the python-rich library functionality \
with a set of changes that were not accepted to rich itself."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python311-enrich-1.2.7-3.1.noarch.rpm"
RPM_HASH = "e8c1a824a00b3d4dc411a7da56edc11eaf24a4077d5b27a3fe309f2431370d233d2b831d67dfa6cc691fa3c3c84d9b624f6a1edec558b7fe686af0b865a4e70d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(enrich) python311-enrich python3dist(enrich)"
RDEPENDS:${PN} += "python(abi) python3.11dist(rich) python311-rich"

inherit rpm
