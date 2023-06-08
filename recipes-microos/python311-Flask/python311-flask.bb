SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It's BSD licensed!"
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python311-Flask-2.2.2-2.1.noarch.rpm"
RPM_HASH = "5aa39e210754428993512c08ba258ef31829371ff21d559e2053ed40e647705048d42eb5e1835d8480a9cac6d231abf4fa42611f69f1e0ed3858f4fbb3699e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask) python311-Flask python3dist(flask)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi) python311-Jinja2 python311-Werkzeug python311-click python311-itsdangerous"

inherit rpm
