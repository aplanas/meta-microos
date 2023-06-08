SUMMARY = "Debug information for package mingw64-gcc"
DESCRIPTION = "This package provides debug information for package mingw64-gcc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-gcc-debug-12.2.0-2.1.noarch.rpm"
RPM_HASH = "271ee13e728bbc70d3563d54538ebbc8b9a0b1ac237d59540379be19328f9ef8c8a7c69c866ed9e46a4cf0b86faf1c76d914d448a444816ad86e608d18d7ab29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gcc-debug"
RDEPENDS:${PN} += ""

inherit rpm
