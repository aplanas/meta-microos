SUMMARY = "Qt6 Quick3DHelpersImpl library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpersimpl-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "38d54a2833e9e53c2567a1f17d1eea7d49655e873990d7e5342a43f48b1780f4d3388e959c48341861d8cdce2cf8b8e789a5618a3a51d6f4d80ce5cef2ffe515"

RPROVIDES:${PN} += "cmake(Qt6Quick3DHelpersImpl) \
pkgconfig(Qt6Quick3DHelpersImpl) \
qt6-quick3dhelpersimpl-devel \
qt6-quick3dhelpersimpl-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Qml) \
cmake(Qt6Quick) \
libQt6Quick3DHelpersImpl6 \
qt6-quick3d-private-devel"

inherit rpm
