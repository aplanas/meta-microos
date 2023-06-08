SUMMARY = "Files needed to build and link programs with pnglite"
DESCRIPTION = "This contains a header file and a link to library for the linker \
to link against pnglite."
LICENSE = "Zlib"

PV = "0.1.17"

RPM_NAME = "pnglite-devel-0.1.17-1.23.aarch64.rpm"
RPM_HASH = "39df0f60bb47e0e52ba1bc4bf281cbd57e681092b44081b8a831608f4611534a753de9374226ca7d54cd4c327963bafe6ee9df58e2986643056316bd05700789"

RPROVIDES:${PN} += "pnglite-devel pnglite-devel(aarch-64)"
RDEPENDS:${PN} += "libpnglite0"

inherit rpm
