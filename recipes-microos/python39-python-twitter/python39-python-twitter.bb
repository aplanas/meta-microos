SUMMARY = "A Python wrapper around the Twitter API"
DESCRIPTION = "This library provides a Python interface for the Twitter API <https://dev.twitter.com/>. \
 \
Twitter <http://twitter.com> provides a service that allows people to connect via the web, IM, and SMS. Twitter exposes a web services API \
which can be used using this library."
LICENSE = "Apache-2.0"

PV = "3.5"

RPM_NAME = "python39-python-twitter-3.5-2.8.noarch.rpm"
RPM_HASH = "8ca8b0163700772d2ede99ab75b102018522650635ca8a0f91a6679ca18d5a0d43bd6bec0a5004e952e83b85b2e6942bd4af97bca7274fadd32f908705759492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-twitter) python39-python-twitter python3dist(python-twitter)"
RDEPENDS:${PN} += "python(abi) python39-future python39-requests python39-requests-oauthlib"

inherit rpm
