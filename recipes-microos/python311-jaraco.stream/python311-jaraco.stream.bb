SUMMARY = "Routines for dealing with data streams"
DESCRIPTION = "Routines for handling streaming data, including a set of generators \
for loading gzip data on the fly."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python311-jaraco.stream-3.0.3-1.6.noarch.rpm"
RPM_HASH = "9f48ada8caa8395a3ecdaa714b41327162c981409264498869793da537b52bea0fbfa863879bf840ae7590b4781bb9dec2c2bdff3778928a2c266fa006836361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.stream) python311-jaraco.stream python3dist(jaraco.stream)"
RDEPENDS:${PN} += "python(abi) python311-more-itertools"

inherit rpm
