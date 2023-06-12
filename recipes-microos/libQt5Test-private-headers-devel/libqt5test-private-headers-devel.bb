SUMMARY = "Non-ABI stable experimental API for the Qt5 test library"
DESCRIPTION = "This package provides private headers of libQt5Test that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Test-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "6f2a441b91bd5a30b78c3b137a59d6d36ccaf9da5230df91da62361f30614ca98ccb7c3585586c2c503ff7c8f242f0e15ec86878cb543dfc7069357026031788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Test-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Test-devel"

inherit rpm
