SUMMARY = "A library for reading/writing binary plists"
DESCRIPTION = "biplist is a binary plist parser/generator for Python. \
 \
Binary Property List (plist) files provide a faster and smaller serialization \
format for property lists on OS X. This is a library for generating binary \
plists which can be read by OS X, iOS, or other clients."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python311-biplist-1.0.3-4.8.noarch.rpm"
RPM_HASH = "2e8a6bbcf6691e89d11620aa475e23858c710587b8373e897af77cf186b73add4c9df5681d511b7480eb94a1b5a932209b77232f7a4fbda020d2091766e3d620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(biplist) python311-biplist python3dist(biplist)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
