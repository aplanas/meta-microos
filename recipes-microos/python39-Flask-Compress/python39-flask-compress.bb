SUMMARY = "Compress responses in Flask apps with gzip"
DESCRIPTION = "Flask-Compress allows compressing a Flask application's \
responses with gzip. \
 \
The preferred solution is to have a server (like Nginx) automatically \
compress the static files. If that option is not available, \
Flask-Compress can solve the problem."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "python39-Flask-Compress-1.13-1.3.noarch.rpm"
RPM_HASH = "eec79ad8a53344736751b12e32cca0c3f587d53e211b2076a67d0fa82e1c982a72dc19fae4bc81d964ad19fc685574fb07c57838ac9423a8d718a13982594786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-compress) python39-Flask-Compress python3dist(flask-compress)"
RDEPENDS:${PN} += "python(abi) python39-Brotli python39-Flask"

inherit rpm
