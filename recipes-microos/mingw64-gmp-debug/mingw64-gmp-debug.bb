SUMMARY = "Debug information for package mingw64-gmp"
DESCRIPTION = "This package provides debug information for package mingw64-gmp. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-gmp-debug-6.1.1-3.11.noarch.rpm"
RPM_HASH = "c36c4319947a99abc1cdb2dfe476342a499ce85acb622c51d7a6e4bc760428312af2c3ec624fd23269d5d7539b6780105594075c2646f1c06ef6eb4881c0b9a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gmp-debug"
RDEPENDS:${PN} += ""

inherit rpm
