SUMMARY = "A set of py.test fixtures to test Flask applications"
DESCRIPTION = "An extension of pytest test runner which provides a set of useful tools \
to simplify testing and development of the Flask extensions and applications."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pytest-flask-1.0.0-1.12.noarch.rpm"
RPM_HASH = "cfefb5ad2933388b761e54e629976fe9f8a0c95dcd35e5313ea3b1b271c57197687f539b2821c55fae5886e94adcdc9d1e02e6cbca2e629f1382c83592823918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flask python3.10dist(pytest-flask) python310-pytest-flask python3dist(pytest-flask)"
RDEPENDS:${PN} += "python(abi) python310-Flask python310-Werkzeug python310-pytest"

inherit rpm
