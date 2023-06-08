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

RPM_NAME = "python39-isort-5.12.0-2.1.noarch.rpm"
RPM_HASH = "a997041ae01ecf7cdfb16a5ff2eb7745cfbf67ba444379f342d7195af987dd36f3eae4f114557d83ac08231aa52f77610ff9abeba3c694aea1f69a554e256ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(isort) python39-isort python3dist(isort)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
