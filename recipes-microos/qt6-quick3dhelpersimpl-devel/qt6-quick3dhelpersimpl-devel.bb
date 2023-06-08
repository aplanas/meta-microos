SUMMARY = "Qt6 Quick3DHelpersImpl library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dhelpersimpl-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "37ddd49bcb303075b1111e001e5733e37faca3fe6e7fc691e724b17e22952aca86c043ebba0fb7d2fbccbd77c130933c8c7bdbeb50ddc8bcd33a0c44556d89e0"

RPROVIDES:${PN} += "cmake(Qt6Quick3DHelpersImpl) pkgconfig(Qt6Quick3DHelpersImpl) qt6-quick3dhelpersimpl-devel qt6-quick3dhelpersimpl-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) cmake(Qt6Quick) libQt6Quick3DHelpersImpl6 qt6-quick3d-private-devel"

inherit rpm
