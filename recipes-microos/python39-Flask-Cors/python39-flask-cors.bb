SUMMARY = "A Flask extension adding a decorator for CORS support"
DESCRIPTION = "A Flask extension for handling Cross Origin Resource Sharing (CORS), \
making cross-origin AJAX possible."
LICENSE = "MIT"

PV = "3.0.10"

RPM_NAME = "python39-Flask-Cors-3.0.10-3.6.noarch.rpm"
RPM_HASH = "4c125881b6082a22975fc9909740482c0f1642f8645ec94247d178259323c415201aec622ab621b87b029fb7e4da325f0cff9477f7da2e19aa78fa642d62492a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-cors) \
python39-Flask-Cors \
python3dist(flask-cors)"
RDEPENDS:${PN} += "python(abi) \
python39-Flask \
python39-six"

inherit rpm
