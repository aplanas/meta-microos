SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python39-cookiecutter-2.1.1-1.4.noarch.rpm"
RPM_HASH = "a29be35f46940b1d6ae083717b03ee811f1bf62f4e7791fc879357f11c20f3a28f8e874371ee67dfd17616653c5acbd0478210c4a3d3fc991a49754aa3f2e3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cookiecutter) python39-cookiecutter python3dist(cookiecutter)"
RDEPENDS:${PN} += "(python39-Jinja2 >= 2.7 with python39-Jinja2 < 4) (python39-click >= 7 with python39-click < 9) /bin/sh /usr/bin/python3.9 git-core python(abi) python39-PyYAML python39-binaryornot python39-future python39-jinja2-time python39-poyo python39-python-slugify python39-requests python39-whichcraft update-alternatives"

inherit rpm
