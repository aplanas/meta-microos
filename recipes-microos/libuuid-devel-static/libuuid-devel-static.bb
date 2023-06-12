SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.38.1"

RPM_NAME = "libuuid-devel-static-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "a20a92a467048fbb6973a7b6bebcf602b074191a3c28231e2170f2a870784a54c21994704a39e09a54f89630819432b96ce37c4b02de19101e79f42bde14715f"

RPROVIDES:${PN} += "libuuid-devel-static \
libuuid-devel-static(aarch-64)"
RDEPENDS:${PN} += "libuuid-devel"

inherit rpm
