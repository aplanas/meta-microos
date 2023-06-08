SUMMARY = "Module for creating simple ASCII tables"
DESCRIPTION = "texttable is a module to generate a formatted text table, using ASCII \
characters."
LICENSE = "MIT"

PV = "1.6.7"

RPM_NAME = "python311-texttable-1.6.7-1.3.noarch.rpm"
RPM_HASH = "6e41fb529059cd8c5447216eab4733a808ae34c6f84ceeaaf0972516c57cfd706057935c62ed5845ac3cc2a2ca8b6477a25876f7aea94e9f08323a670892400d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(texttable) python311-texttable python3dist(texttable)"
RDEPENDS:${PN} += "python(abi) python311-base"

inherit rpm
