SUMMARY = "User session management for Flask"
DESCRIPTION = "Flask-Login provides user session management for Flask. It handles the common \
tasks of logging in, logging out, and remembering your users' \
sessions over extended periods of time. \
 \
Flask-Login is not bound to any particular database system or permissions \
model. The only requirement is that your user objects implement a few \
methods, and that you provide a callback to the extension capable of \
loading users from their ID."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-Flask-Login-0.6.2-1.3.noarch.rpm"
RPM_HASH = "825cdf2ff05069402d13ee7cbda4cffd01d79a6d44b53a5f80a15cee21d17b5c8a5a551f04dd2c1991612253862709fc9123e56f3129c62d3c8e993200bd7284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-login) python311-Flask-Login python3dist(flask-login)"
RDEPENDS:${PN} += "python(abi) python311-Flask"

inherit rpm
