SUMMARY = "Flask minifier for HTML responses"
DESCRIPTION = "Flask-HTMLmin minimizes HTML rendered by Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-Flask-HTMLmin-2.2.0-1.3.noarch.rpm"
RPM_HASH = "2bacb0dcbc83168fa6b7ee41f252578d5b36428463078ae080a0d1e5972b3e12159628549274f28fb367918dd7adccb8b1ed3888049071892be6f331b81251c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-HTMLmin python3.10dist(flask-htmlmin) python310-Flask-HTMLmin python3dist(flask-htmlmin)"
RDEPENDS:${PN} += "python(abi) python310-Flask python310-cssmin python310-htmlmin"

inherit rpm
