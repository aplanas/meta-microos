SUMMARY = "Adds caching support to your Flask application"
DESCRIPTION = "Adds caching support to your Flask application. Continuation of the Flask-Cache \
Extension."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python310-Flask-Caching-1.9.0-1.12.noarch.rpm"
RPM_HASH = "6c3284537e9c5b725129102eaaa2adff95010d7a74c1582b767f924e4a1081796a59dab01822ca71411a3e2d58e2932d6329ff066a05de1380ea45ecb802b8e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Caching python3.10dist(flask-caching) python310-Flask-Caching python3dist(flask-caching)"
RDEPENDS:${PN} += "python(abi) python310-Flask"

inherit rpm
