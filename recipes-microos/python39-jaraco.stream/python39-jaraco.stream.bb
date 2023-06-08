SUMMARY = "Routines for dealing with data streams"
DESCRIPTION = "Routines for handling streaming data, including a set of generators \
for loading gzip data on the fly."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python39-jaraco.stream-3.0.3-1.6.noarch.rpm"
RPM_HASH = "18a1330141456aa757ee26523f73bff5287c185010e92b3dc3568aa89f66dcd41dc429f8c7409588e5e86db92fe2c3d73526f68deb5aedcb5bf92b032c27f811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.stream) python39-jaraco.stream python3dist(jaraco.stream)"
RDEPENDS:${PN} += "python(abi) python39-more-itertools"

inherit rpm
