SUMMARY = "Qt 6 ImageFormat Plugins"
DESCRIPTION = "Plugins for additional image formats: TIFF, MNG, TGA, WEBP, WBMP"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-imageformats-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "5b040c38bd93e37c1f7b040d387cf1ad49fcd68dce15790726c401589fbe04b8446cbb5d6b70c238be099b7f180dc0956e966c4029a03299323c5dddf3aaf457"

RPROVIDES:${PN} += "libqicns.so()(64bit) libqicns.so(Qt_6)(64bit) libqicns.so(Qt_6.0)(64bit) libqicns.so(Qt_6.1)(64bit) libqicns.so(Qt_6.2)(64bit) libqicns.so(Qt_6.3)(64bit) libqicns.so(Qt_6.4)(64bit) libqicns.so(Qt_6.5)(64bit) libqicns.so(Qt_6.5.0_PRIVATE_API)(64bit) libqmng.so()(64bit) libqmng.so(Qt_6)(64bit) libqmng.so(Qt_6.0)(64bit) libqmng.so(Qt_6.1)(64bit) libqmng.so(Qt_6.2)(64bit) libqmng.so(Qt_6.3)(64bit) libqmng.so(Qt_6.4)(64bit) libqmng.so(Qt_6.5)(64bit) libqmng.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtga.so()(64bit) libqtga.so(Qt_6)(64bit) libqtga.so(Qt_6.0)(64bit) libqtga.so(Qt_6.1)(64bit) libqtga.so(Qt_6.2)(64bit) libqtga.so(Qt_6.3)(64bit) libqtga.so(Qt_6.4)(64bit) libqtga.so(Qt_6.5)(64bit) libqtga.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtiff.so()(64bit) libqtiff.so(Qt_6)(64bit) libqtiff.so(Qt_6.0)(64bit) libqtiff.so(Qt_6.1)(64bit) libqtiff.so(Qt_6.2)(64bit) libqtiff.so(Qt_6.3)(64bit) libqtiff.so(Qt_6.4)(64bit) libqtiff.so(Qt_6.5)(64bit) libqtiff.so(Qt_6.5.0_PRIVATE_API)(64bit) libqwbmp.so()(64bit) libqwbmp.so(Qt_6)(64bit) libqwbmp.so(Qt_6.0)(64bit) libqwbmp.so(Qt_6.1)(64bit) libqwbmp.so(Qt_6.2)(64bit) libqwbmp.so(Qt_6.3)(64bit) libqwbmp.so(Qt_6.4)(64bit) libqwbmp.so(Qt_6.5)(64bit) libqwbmp.so(Qt_6.5.0_PRIVATE_API)(64bit) libqwebp.so()(64bit) libqwebp.so(Qt_6)(64bit) libqwebp.so(Qt_6.0)(64bit) libqwebp.so(Qt_6.1)(64bit) libqwebp.so(Qt_6.2)(64bit) libqwebp.so(Qt_6.3)(64bit) libqwebp.so(Qt_6.4)(64bit) libqwebp.so(Qt_6.5)(64bit) libqwebp.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-imageformats qt6-imageformats(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmng.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libwebp.so.7()(64bit) libwebpdemux.so.2()(64bit) libwebpmux.so.3()(64bit)"

inherit rpm
