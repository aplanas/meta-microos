SUMMARY = "Security for Flask apps"
DESCRIPTION = "Flask-Security-Too is a Python module to add security features to a Flask \
application. This is a independently maintained version of Flask-Security \
based on the 3.0.0 version of the original."
LICENSE = "MIT"

PV = "5.1.1"

RPM_NAME = "python39-Flask-Security-Too-5.1.1-2.1.noarch.rpm"
RPM_HASH = "d8f1f453bb608f7d81fa004e9f3c59e3535a7390b8f1f7868981a39dc165d710fa3a840ebbe658e5ab1747b9be0f1012df1e896f7efaee6cf181b9f4c2c6e605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-security-too) python39-Flask-Security python39-Flask-Security-Too python3dist(flask-security-too)"
RDEPENDS:${PN} += "python(abi) python39-Flask python39-Flask-Babel python39-Flask-Login python39-Flask-Principal python39-Flask-WTF python39-Werkzeug python39-bcrypt python39-bleach python39-blinker python39-cryptography python39-email-validator python39-itsdangerous python39-passlib"

inherit rpm
