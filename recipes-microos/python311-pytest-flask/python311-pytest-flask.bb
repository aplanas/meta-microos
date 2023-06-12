SUMMARY = "A set of py.test fixtures to test Flask applications"
DESCRIPTION = "An extension of pytest test runner which provides a set of useful tools \
to simplify testing and development of the Flask extensions and applications."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-pytest-flask-1.2.0-1.1.noarch.rpm"
RPM_HASH = "cd344f75a62b19d7c892b9dc3fd1d36db99e2c90109f7e03b19a9fbf6f2661bf28e132dcee7daa4688dffa82525eef275bb4130f270056461d56fe71cb350f67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-flask) python311-pytest-flask python3dist(pytest-flask)"
RDEPENDS:${PN} += "python(abi) python311-Flask python311-Werkzeug python311-pytest"

inherit rpm
