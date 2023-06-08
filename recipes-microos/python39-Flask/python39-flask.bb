SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python39-Flask-2.2.2-2.1.noarch.rpm"
RPM_HASH = "f0c0603f66c8e79f48d269cb08282a2d3f51f48b8ff180c13cbf36eef643e0d0267ea142099bca53e6f8281cdbad452af0909d2ded8c21001897f930aed4502d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask) python39-Flask python3dist(flask)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts python(abi) python39-Jinja2 python39-Werkzeug python39-click python39-importlib-metadata python39-itsdangerous"

inherit rpm
