SUMMARY = "A set of py.test fixtures to test Flask applications"
DESCRIPTION = "An extension of pytest test runner which provides a set of useful tools \
to simplify testing and development of the Flask extensions and applications."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-pytest-flask-1.0.0-1.12.noarch.rpm"
RPM_HASH = "0c17c4d73517a914e0c811969b64e90ba3f7bd343aa2af68dd44417861a128a8f28450aa6587e98c2bf9a75d2b6c62aa8beb3d465211e8e0477a84e9c37bb7b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-flask) python311-pytest-flask python3dist(pytest-flask)"
RDEPENDS:${PN} += "python(abi) python311-Flask python311-Werkzeug python311-pytest"

inherit rpm
