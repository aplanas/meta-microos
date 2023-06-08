SUMMARY = "A decorator for caching properties in classes"
DESCRIPTION = "A decorator for caching properties in classes. It makes caching of time or \
computational expensive properties quick and easy and it works in Python 2 \
and 3."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "python310-cached-property-1.5.2-4.1.noarch.rpm"
RPM_HASH = "f6f9871eb4caa2d087fe39b06a865698185b8868a63a0d47fc8b087d7330f4137bdd1977ca9e699d223212e1ac95446eada09a33d2ad19d93cefa9a11c1f19f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cached-property python3.10dist(cached-property) python310-cached-property python3dist(cached-property)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
