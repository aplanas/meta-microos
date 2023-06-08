SUMMARY = "Non-ABI stable experimental API for the Qt5 core library"
DESCRIPTION = "This package provides private headers of libQt5Core that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Core-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "f004c37790c67ba298854dc204c493f8bdedb6f845b99abd24c65639ccf2416e76b3d9348aecfbf3bd3ea75b262215b58440a4d25570eb55c7f5dfe623e0a5c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Core-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-devel"

inherit rpm
