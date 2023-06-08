SUMMARY = "Security for Flask apps"
DESCRIPTION = "Flask-Security-Too is a Python module to add security features to a Flask \
application. This is a independently maintained version of Flask-Security \
based on the 3.0.0 version of the original."
LICENSE = "MIT"

PV = "5.1.1"

RPM_NAME = "python311-Flask-Security-Too-5.1.1-2.1.noarch.rpm"
RPM_HASH = "9cd5a14fae84e09f075eafb7c52ec7d53f8e88998c111fe13f8778856c774537f6dcc6d4859683da4033309c4c32ce6004485572a9e29774edc56a22a5a4040d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-security-too) python311-Flask-Security python311-Flask-Security-Too python3dist(flask-security-too)"
RDEPENDS:${PN} += "python(abi) python311-Flask python311-Flask-Babel python311-Flask-Login python311-Flask-Principal python311-Flask-WTF python311-Werkzeug python311-bcrypt python311-bleach python311-blinker python311-cryptography python311-email-validator python311-itsdangerous python311-passlib"

inherit rpm
