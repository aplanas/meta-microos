SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python310-Flask-2.2.2-2.1.noarch.rpm"
RPM_HASH = "f8feff5c2ec139412734340be43d2001624aed692a036ea3585ec13a508db1a19b9fbcc312781ad40113ed702142d6cc6ad74dbf92c0ffc78c44f6691019a28e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask python3.10dist(flask) python310-Flask python3dist(flask)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts python(abi) python310-Jinja2 python310-Werkzeug python310-click python310-itsdangerous"

inherit rpm
