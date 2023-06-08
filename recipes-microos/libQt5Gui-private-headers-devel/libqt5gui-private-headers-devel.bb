SUMMARY = "Non-ABI stable experimental API for the Qt5 GUI library"
DESCRIPTION = "This package provides private headers of libQt5Gui that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Gui-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "e692e5368b459c70d4df6a3603c6dbc5a9ec5e507d340d766f862e36bc5a9ac7bc0878d9c031ede3ac77e9e56f142fb72e0c33f0fc0f5eb59ffdcf43f7803fce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Gui-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Gui-devel"

inherit rpm
