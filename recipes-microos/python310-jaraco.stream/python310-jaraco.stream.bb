SUMMARY = "Routines for dealing with data streams"
DESCRIPTION = "Routines for handling streaming data, including a set of generators \
for loading gzip data on the fly."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python310-jaraco.stream-3.0.3-1.6.noarch.rpm"
RPM_HASH = "0c3cc06f4337e20e7241e06722a946a7d00be50f852c8f489dcde064d322f94bb30c8d6dafa62db7f94940cdf12f15dc48d58f4adb080b0a9a14b14caa69756d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.stream python3.10dist(jaraco.stream) python310-jaraco.stream python3dist(jaraco.stream)"
RDEPENDS:${PN} += "python(abi) python310-more-itertools"

inherit rpm
