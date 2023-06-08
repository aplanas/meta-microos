SUMMARY = "Non-ABI stable experimental API for the Qt5 RemoteObjects library"
DESCRIPTION = "This package provides private headers of libqt5-qtremoteobjects that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtremoteobjects-private-headers-devel-5.15.9+kde0-1.1.noarch.rpm"
RPM_HASH = "152a2e941b2cb82900dbb994b564fbb43333f46de8042c6cde74b19082cf3bf9a1bae191cc4b435987f79e1b81342db2152f6ac48664fdcc384cc86671758205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtremoteobjects-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libqt5-qtremoteobjects-devel"

inherit rpm
