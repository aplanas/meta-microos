SUMMARY = "Flask extension providing simple email sending capabilities"
DESCRIPTION = "Flask-Mailman is a Flask extension providing simple email sending capabilities. \
 \
It was meant to replace unmaintained Flask-Mail with a better warranty and \
more features."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python311-Flask-Mailman-0.3.0-2.1.noarch.rpm"
RPM_HASH = "2e4b3eeae0e8ebc7230789bf7ef4ae79ec6e1e3fe3a0e2b7b8b7ca60eb5254b76a70c977d0112bd8829cb40d9b3ee3a95f9eff8c464e336c8f17ba65e76a8ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-mailman) python311-Flask-Mailman python3dist(flask-mailman)"
RDEPENDS:${PN} += "python(abi) python311-Flask"

inherit rpm
