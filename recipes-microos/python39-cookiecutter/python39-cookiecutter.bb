SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python39-cookiecutter-2.1.1-2.1.noarch.rpm"
RPM_HASH = "6ff45ee6e88d2f9746d60dacc466cc1e7f673f74df23574b95ab747406693c5c4e0b68ab76e10e744b2fb4de1972a570d093b280a6552bcb291c6b191bc14049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cookiecutter) python39-cookiecutter python3dist(cookiecutter)"
RDEPENDS:${PN} += "(python39-Jinja2 >= 2.7 with python39-Jinja2 < 4) (python39-click >= 7 with python39-click < 9) /bin/sh /usr/bin/python3.9 git-core python(abi) python39-PyYAML python39-binaryornot python39-future python39-jinja2-time python39-poyo python39-python-slugify python39-requests python39-whichcraft update-alternatives"

inherit rpm
