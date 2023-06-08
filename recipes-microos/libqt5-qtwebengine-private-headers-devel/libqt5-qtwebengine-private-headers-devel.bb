SUMMARY = "Non-ABI stable experimental API for the Qt5 WebEngine library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebengine that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.13"

RPM_NAME = "libqt5-qtwebengine-private-headers-devel-5.15.13-3.2.noarch.rpm"
RPM_HASH = "af818e910d0a95f5f10326ebaddcb5ccb9ee8b2db7d759abccb883cae8ea4fbb93f69c731f4a6207abaa8b00fd6e160fe7dfdf315e540ff9f351dd7ce9ba16b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebengine-private-headers-devel"
RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel libqt5-qtdeclarative-private-headers-devel libqt5-qtwebengine-devel"

inherit rpm
