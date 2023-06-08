SUMMARY = "Non-ABI stable experimental API for the Qt5 Multimedia library"
DESCRIPTION = "This package provides private headers of libqt5-qtmultimedia that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde3"

RPM_NAME = "libqt5-qtmultimedia-private-headers-devel-5.15.9+kde3-1.1.noarch.rpm"
RPM_HASH = "502fe4a2ff9f832132400451d61d8f158b4416c0d44579cb894d52f0fca65900f989086d057b6a907ebf9bba82cdb73ffaa52574258b18e3099222e7e8bd7f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Multimedia-private-headers-devel libqt5-qtmultimedia-private-headers-devel"
RDEPENDS:${PN} += "libQt5Gui-private-headers-devel libQt5Widgets-private-headers-devel libqt5-qtmultimedia-devel"

inherit rpm
