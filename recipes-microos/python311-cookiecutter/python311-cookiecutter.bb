SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python311-cookiecutter-2.1.1-1.4.noarch.rpm"
RPM_HASH = "2bb8c643d5b97bb868ef045691c44cc446de65cf4851fccf7b38e1da7dd857aa903f6d1b56cb587e118aa8f6a0f43e64ce207726c5eadce6985f177cdd48a356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cookiecutter) python311-cookiecutter python3dist(cookiecutter)"
RDEPENDS:${PN} += "(python311-Jinja2 >= 2.7 with python311-Jinja2 < 4) (python311-click >= 7 with python311-click < 9) /bin/sh /usr/bin/python3.11 git-core python(abi) python311-PyYAML python311-binaryornot python311-future python311-jinja2-time python311-poyo python311-python-slugify python311-requests python311-whichcraft update-alternatives"

inherit rpm
