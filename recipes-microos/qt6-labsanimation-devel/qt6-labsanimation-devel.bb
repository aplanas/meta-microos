SUMMARY = "Qt 6 LabsAnimation library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsanimation-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "381ba9a8b9d206ffbfc250a5f4410d56aa48dd7fea0d386056d7705378c5fa11e653ffead5df564157de4a711fe58499739e62672619e0192f7e1ffbeceeface"

RPROVIDES:${PN} += "cmake(Qt6LabsAnimation) \
pkgconfig(Qt6LabsAnimation) \
qt6-labsanimation-devel \
qt6-labsanimation-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsAnimation6 \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick) \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
