SUMMARY = "Debug information for package mingw64-mpfr"
DESCRIPTION = "This package provides debug information for package mingw64-mpfr. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "mingw64-mpfr-debug-3.1.4-2.12.noarch.rpm"
RPM_HASH = "d5c8c65d149c4ee53eaa063a0457151b8999d9c606e7f9177cd392a31ad1a9df40a9dbafaf69e882aefa5d502804c2e552d43e5f68b5eec67313436268b2599e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-mpfr-debug"
RDEPENDS:${PN} += ""

inherit rpm
