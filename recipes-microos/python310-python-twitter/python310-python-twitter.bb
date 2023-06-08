SUMMARY = "A Python wrapper around the Twitter API"
DESCRIPTION = "This library provides a Python interface for the Twitter API <https://dev.twitter.com/>. \
 \
Twitter <http://twitter.com> provides a service that allows people to connect via the web, IM, and SMS. Twitter exposes a web services API \
which can be used using this library."
LICENSE = "Apache-2.0"

PV = "3.5"

RPM_NAME = "python310-python-twitter-3.5-2.8.noarch.rpm"
RPM_HASH = "ecd236acfe8ba650b7ce9100704a9f0d710ddcbbb9dae3760f6c98c3ffea1e3c63bb966b4a6d1e072ed71b670c9aa4829fab77ce7e4fc179f9f8b8a0b0d0c170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-twitter python3.10dist(python-twitter) python310-python-twitter python3dist(python-twitter)"
RDEPENDS:${PN} += "python(abi) python310-future python310-requests python310-requests-oauthlib"

inherit rpm
