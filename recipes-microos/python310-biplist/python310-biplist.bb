SUMMARY = "A library for reading/writing binary plists"
DESCRIPTION = "biplist is a binary plist parser/generator for Python. \
 \
Binary Property List (plist) files provide a faster and smaller serialization \
format for property lists on OS X. This is a library for generating binary \
plists which can be read by OS X, iOS, or other clients."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python310-biplist-1.0.3-4.8.noarch.rpm"
RPM_HASH = "3840dbffc7721f1740c38e7fed360736202d11248d2aad8b149f0fbc9c859ea839478102a7befc406e7713169ee260c4e2344338a28bad989f29e8c9070176bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-biplist python3.10dist(biplist) python310-biplist python3dist(biplist)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
