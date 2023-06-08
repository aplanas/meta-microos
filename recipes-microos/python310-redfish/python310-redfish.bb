SUMMARY = "Redfish Python Library"
DESCRIPTION = "The Redfish library performs the basic HTTPS operations GET, POST, \
PUT, PATCH and DELETE on resources using the HATEOAS (Hypermedia as \
the Engine of Application State) Redfish architecture."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "python310-redfish-3.1.8-1.3.noarch.rpm"
RPM_HASH = "8fc25a25f9ca9422f46971ed77fb70990b58c49f4f4f91370591b6493948dcef3248f4f929e08209c65c91d93d1edb1e7a69cc2c85d13696a599115563f4fbe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-redfish python3.10dist(redfish) python310-redfish python3dist(redfish)"
RDEPENDS:${PN} += "python(abi) python310-jsonpatch python310-jsonpath-rw python310-jsonpointer python310-requests python310-requests-toolbelt python310-requests-unixsocket"

inherit rpm
