SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_media-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "da293c8ebff34b4533c7ccb14d76d1203760fd9e3f1c082d431a8103f0f9059898e80dabb7c2a3c6268e629f3a84b31629ee95c66a2c56049860bfcfaf599934"

RPROVIDES:${PN} += "libwx_gtk2u_media-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_media-suse-nostl3_0_5 libwx_gtk2u_media-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
