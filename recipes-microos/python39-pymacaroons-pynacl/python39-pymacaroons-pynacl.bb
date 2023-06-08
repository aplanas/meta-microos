SUMMARY = "Macaroon library for Python"
DESCRIPTION = "Macaroons, like cookies, are a form of bearer credential. \
Unlike opaque tokens, macaroons embed caveats that define \
specific authorization requirements for the target service, \
the service that issued the root macaroon and which is \
capable of verifying the integrity of macaroons it recieves. \
 \
Macaroons allow for delegation and attenuation of authorization. \
They are simple and fast to verify, and decouple authorization policy \
from the enforcement of that policy. \
 \
This is a Python implementation of Macaroons."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python39-pymacaroons-pynacl-0.9.3-5.6.noarch.rpm"
RPM_HASH = "8954e793ed3b3709e09fdc6a996d5e15cf0a3dd9d89afb1d187342b59b73a64865c4d89f54adae65db571059f043d9b09fa5df72e9ea4ddfa76d87b79dd82a00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pymacaroons-pynacl) python39-pymacaroons-pynacl python3dist(pymacaroons-pynacl)"
RDEPENDS:${PN} += "python(abi) python39-PyNaCl python39-cffi python39-six"

inherit rpm
