SUMMARY = "wxWidgets basic GUI class library"
DESCRIPTION = "Basic GUI classes such as GDI classes or controls are in this \
library. All wxWidgets GUI applications must link against this \
library, only console mode applications need not."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_core-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "efd742c837b3af66f8507c43a42deaeb4f03ef23e863e89b10730a29313aeba7b67394c0ccb34d1ddd0b5a5e08974b32f2289eba19a58d7457be15732a096d35"

RPROVIDES:${PN} += "libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_core-suse9_0_0 libwx_gtk3u_core-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libXtst.so.6()(64bit) libc.so.6(GLIBC_2.33)(64bit) libcairo.so.2()(64bit) libfontconfig.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnotify.so.4()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpangoft2-1.0.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
