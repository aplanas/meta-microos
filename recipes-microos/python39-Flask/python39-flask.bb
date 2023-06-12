SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python39-Flask-2.2.5-1.1.noarch.rpm"
RPM_HASH = "f977f5881a1ea7aa0c47a2ab77bf5d607b4a0fc19cd01068d44fd40e0ab2370deebe53ef030ee6a0f9e8a6efc59376c7faa9ec5f8201a904f7a78995d91650b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask) python39-Flask python3dist(flask)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts python(abi) python39-Jinja2 python39-Werkzeug python39-click python39-importlib-metadata python39-itsdangerous"

inherit rpm
