SUMMARY = "Development files for the Qt 5 Script library"
DESCRIPTION = "Qt Script is a module for adding scripting to applications. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libQt5Script5."
LICENSE = "(LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later) & LGPL-2.0-or-later & LGPL-2.1-only"

PV = "5.15.12"

RPM_NAME = "libqt5-qtscript-devel-5.15.12-2.3.aarch64.rpm"
RPM_HASH = "7dc806f82c56b937a84fb057cf2d697a7ca605c7e7e35455f03a0e6f93012b0b6a2b40261926437b928ea96f8c4ae1332e07d3afea3e49b86cea440c3211761e"

RPROVIDES:${PN} += "cmake(Qt5Script) cmake(Qt5ScriptTools) libQt5Script-devel libqt5-qtscript-devel libqt5-qtscript-devel(aarch-64) pkgconfig(Qt5Script) pkgconfig(Qt5ScriptTools)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Script5 pkgconfig(Qt5Core)"

inherit rpm
