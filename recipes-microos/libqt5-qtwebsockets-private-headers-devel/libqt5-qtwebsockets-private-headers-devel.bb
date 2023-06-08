SUMMARY = "Non-ABI stable experimental API for the Qt5 WebSocket library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebsockets that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde2"

RPM_NAME = "libqt5-qtwebsockets-private-headers-devel-5.15.9+kde2-1.1.noarch.rpm"
RPM_HASH = "acc10132370ac77e4168db0c8af395d12866250f9cc981e437ac2a7f110e51e7551d66ad1e7251b22b120a77a66a946f235bbfb133a0ace29c3d680808bdf3da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebsockets-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libqt5-qtwebsockets-devel"

inherit rpm
