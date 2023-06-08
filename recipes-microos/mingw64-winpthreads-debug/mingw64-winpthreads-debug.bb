SUMMARY = "Debug information for package mingw64-winpthreads"
DESCRIPTION = "This package provides debug information for package mingw64-winpthreads. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw64-winpthreads-debug-10.0.0-1.6.noarch.rpm"
RPM_HASH = "8ea98d1c4f083df31af34dba23fe0b697268d87f6174f5ea8078f561b463cd70f54e01067c1724aaca44e8529527305f0f26760dda55047c78f3185f2d5b0723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-winpthreads-debug"
RDEPENDS:${PN} += ""

inherit rpm
