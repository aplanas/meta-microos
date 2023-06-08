SUMMARY = "Development files for the Qt 5 Script library"
DESCRIPTION = "Qt Script is a module for adding scripting to applications. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libQt5Script5."
LICENSE = "(LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later) & LGPL-2.0-or-later & LGPL-2.1-only"

PV = "5.15.12"

RPM_NAME = "libqt5-qtscript-devel-5.15.12-2.2.aarch64.rpm"
RPM_HASH = "e4c78ec0c8148ce7293b07eaf5e57296cefbd6b227b2e0c0559ef1ecd30eee7813367f30e3d93e877ccb514990c0bcad14783b8f1aa9be4959f7633a562c34ed"

RPROVIDES:${PN} += "cmake(Qt5Script) cmake(Qt5ScriptTools) libQt5Script-devel libqt5-qtscript-devel libqt5-qtscript-devel(aarch-64) pkgconfig(Qt5Script) pkgconfig(Qt5ScriptTools)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Script5 pkgconfig(Qt5Core)"

inherit rpm
