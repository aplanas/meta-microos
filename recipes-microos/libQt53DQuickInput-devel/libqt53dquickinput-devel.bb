SUMMARY = "Development files for the Qt 5 QuickInput 3D library"
DESCRIPTION = "Development files for the Qt 5 Quick Input 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuickInput-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "49655e2a667c24461d30e1d6dd063b8020d164bd4cd3f9188f9e8f445cfd9f68aa1ed0789406146fdf8f9ecffe60c7508fb7a786ee5527ce22537e3544ee401f"

RPROVIDES:${PN} += "cmake(Qt53DQuickInput) \
libQt53DQuickInput-devel \
libQt53DQuickInput-devel(aarch-64) \
pkgconfig(Qt53DQuickInput)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickInput5 \
pkgconfig(Qt53DCore) \
pkgconfig(Qt53DInput) \
pkgconfig(Qt53DQuick) \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Qml)"

inherit rpm
