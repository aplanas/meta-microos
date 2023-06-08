SUMMARY = "Qt 6 QmlCompiler library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmlcompiler-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "f46c566733aebbcaf76a6de2cdd74369e9752a921dd5665e93dd28891fa14edcb1d237ab98b34437e8f40b7a922276494d5fec72f9f22ba0eb9da169ece69cce"

RPROVIDES:${PN} += "cmake(Qt6QmlCompilerPrivate) qt6-qmlcompiler-devel-static qt6-qmlcompiler-private-devel qt6-qmlcompiler-private-devel(aarch-64)"
RDEPENDS:${PN} += "libQt6QmlCompiler6 qt6-core-private-devel qt6-qml-private-devel"

inherit rpm
