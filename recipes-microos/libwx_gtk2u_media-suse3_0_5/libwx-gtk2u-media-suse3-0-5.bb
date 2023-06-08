SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_media-suse3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "2ec95fa4d607bd4d02c5f0aecb159f4a15ca70de8c37d1bbed8e7b6329e3f55154a0f1f6bbb473b4bbf4c0dee73cf212fbf801a6bb0949c53ab6e355c7d00db8"

RPROVIDES:${PN} += "libwx_gtk2u_media-suse.so.3.0.5()(64bit) libwx_gtk2u_media-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_media-suse.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_media-suse.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_media-suse.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_media-suse.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_media-suse.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_media-suse3_0_5 libwx_gtk2u_media-suse3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse.so.3.0.5()(64bit) libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
