SUMMARY = "Qt 6 QuickControls2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d4ecbb5c06eca62360206fa28e241537ac8ae7708c9f5cda5ab90b8277313dc75dac7060ddcb79b1a395b6528baae3e9b6e3937fd8bed137a3c85869abbad34a"

RPROVIDES:${PN} += "cmake(Qt6QuickControls2) \
pkgconfig(Qt6QuickControls2) \
qt6-quickcontrols2-devel \
qt6-quickcontrols2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Quick) \
libQt6QuickControls2-6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Quick) \
qt6-qml-private-devel \
qt6-quicktemplates2-private-devel"

inherit rpm
