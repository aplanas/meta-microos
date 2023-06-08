SUMMARY = "Compress responses in Flask apps with gzip"
DESCRIPTION = "Flask-Compress allows compressing a Flask application's \
responses with gzip. \
 \
The preferred solution is to have a server (like Nginx) automatically \
compress the static files. If that option is not available, \
Flask-Compress can solve the problem."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "python311-Flask-Compress-1.13-1.3.noarch.rpm"
RPM_HASH = "42ea3aa197c5493ce70c317e9083fffe9c5fef8c3cd5e3bb4bb4b517851d57957353aed0b4d471a2cb9315dfe32a20d4c4f63094467569a8b474ec71e80785f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-compress) python311-Flask-Compress python3dist(flask-compress)"
RDEPENDS:${PN} += "python(abi) python311-Brotli python311-Flask"

inherit rpm
