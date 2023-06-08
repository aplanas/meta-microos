SUMMARY = "A set of py.test fixtures to test Flask applications"
DESCRIPTION = "An extension of pytest test runner which provides a set of useful tools \
to simplify testing and development of the Flask extensions and applications."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-pytest-flask-1.0.0-1.12.noarch.rpm"
RPM_HASH = "26e2b51148ed623492b33a2805d6b164b30c2f24e9e33dd536b1774e8cb3cb1a4d719cf54beb490ad75458a08aee5bf5947ee508440cdf0a3a9015cf7db4fd45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-flask) python39-pytest-flask python3dist(pytest-flask)"
RDEPENDS:${PN} += "python(abi) python39-Flask python39-Werkzeug python39-pytest"

inherit rpm
