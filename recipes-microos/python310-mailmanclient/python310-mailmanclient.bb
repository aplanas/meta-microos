SUMMARY = "Python bindings for the Mailman REST API"
DESCRIPTION = "Python bindings for Mailman REST API."
LICENSE = "LGPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "python310-mailmanclient-3.3.4-1.4.noarch.rpm"
RPM_HASH = "8d5e4eee347596ff79d1185eedf5cf36b91709cf3ff18f58a82a4f57cfa061c75c117aa74886d8bdd2dd129e322850eb0d1dc3b7355ec68ce763bc683b64dfa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mailmanclient python3.10dist(mailmanclient) python310-mailmanclient python3dist(mailmanclient)"
RDEPENDS:${PN} += "python(abi) python310-requests"

inherit rpm
