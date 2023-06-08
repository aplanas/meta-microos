SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "mingw64-cross-ctest-1.0.0-1.1.noarch.rpm"
RPM_HASH = "4eb23a5f6cee087ebbf6cabf4045bf6bee879584125f9088179cf98b152ef1f23cca7dac2cdc18a803c1ea3dedf8e5e7da0745ff04df2e1223ae501e0daa7daa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cross-ctest"
RDEPENDS:${PN} += "mingw64-cross-cmake mingw64-cross-wine"

inherit rpm
