SUMMARY = "Non-ABI stable experimental API for the Qt5 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt5OpenGL that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5OpenGL-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "32f10500dbd0d17a7445c292afd06eef25d5d2557d954ecdbc941d10561e4764189116c599265c943719b74cf80507c4c04e8734a243893b75bcef2e872ffdfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5OpenGL-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Gui-private-headers-devel libQt5OpenGL-devel libQt5Widgets-private-headers-devel"

inherit rpm
