SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_media-suse-nostl3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "7013078c4ad816b5fca561ec68bbf6dd1f9117e548167cdf9d26fe7901e50c82a383fd0655a33dd7ef3e78a40cbf5fd8853057f03f0fea6ad2ce23e4cbcbd915"

RPROVIDES:${PN} += "libwx_gtk2u_media-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_media-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_media-suse-nostl3_0_5 libwx_gtk2u_media-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
