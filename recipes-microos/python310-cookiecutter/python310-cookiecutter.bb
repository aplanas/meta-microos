SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python310-cookiecutter-2.1.1-1.4.noarch.rpm"
RPM_HASH = "1a0bd1407d197e5e5214ee21174b92c0404980671e221715c59bffb5c30296859a93fbc588c8982d3f1ef9b9ac6c604b02982d195a34aa93743f9212afcd94a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cookiecutter python3-cookiecutter python3.10dist(cookiecutter) python310-cookiecutter python3dist(cookiecutter)"
RDEPENDS:${PN} += "(python310-Jinja2 >= 2.7 with python310-Jinja2 < 4) (python310-click >= 7 with python310-click < 9) /bin/sh /usr/bin/python3.10 git-core python(abi) python310-PyYAML python310-binaryornot python310-future python310-jinja2-time python310-poyo python310-python-slugify python310-requests python310-whichcraft update-alternatives"

inherit rpm
