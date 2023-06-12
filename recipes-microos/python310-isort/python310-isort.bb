SUMMARY = "A Python utility / library to sort Python imports"
DESCRIPTION = "isort your python imports for you so you don't have to. \
 \
isort is a Python utility / library to sort imports alphabetically, and \
automatically separated into sections and by type. It provides a command line \
utility, Python library and plugins for various editors to quickly sort all your \
imports. It requires Python 3.8+ to run but supports formatting Python 2 code \
too."
LICENSE = "MIT"

PV = "5.12.0"

RPM_NAME = "python310-isort-5.12.0-2.1.noarch.rpm"
RPM_HASH = "f8ed530acccd7e1947f37883ce055b587a04678115643e0be2ca2d8468f3860e24713fd3126c5831dc729aaf96672d09d6485d4484446de18c07158efcbff0d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isort \
python3.10dist(isort) \
python310-isort \
python3dist(isort)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
