SUMMARY = "Qt 6 QmlCompiler library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlcompiler-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "c667c8744f1e7caea057bbcea0bca8521f2306e347a10b496258565a2499167e7b823c7c570c2895faeff0e961f1ad43028982c6a3d45e8251e43e40128ee34a"

RPROVIDES:${PN} += "cmake(Qt6QmlCompilerPrivate) \
qt6-qmlcompiler-devel-static \
qt6-qmlcompiler-private-devel \
qt6-qmlcompiler-private-devel(aarch-64)"
RDEPENDS:${PN} += "libQt6QmlCompiler6 \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
