SUMMARY = "Non-ABI stable experimental API for the Qt5 test library"
DESCRIPTION = "This package provides private headers of libQt5Test that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Test-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "1c10ab52a1cb32ba51f13a44d49f547c1734d5c18d5894663d6d64ee6a6b7e0e669b5105f26aa73bc59eb8a410b5939e675a0eae92d4be22044d54b48741853d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Test-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Test-devel"

inherit rpm
