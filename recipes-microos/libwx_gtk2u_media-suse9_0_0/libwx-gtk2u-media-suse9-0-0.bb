SUMMARY = "wxWidgets media class library"
DESCRIPTION = "wxMediaCtrl is a class for displaying types of media, such as videos, \
audio files, natively through native codecs."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_media-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "45ca38779c5c54d5e608fef4f915848b76713c43b605e35e9b5056e85d9191bc12df51b48bea8966c687afce0aa754bf09d3c9f3be30f77af7227c54b8862503"

RPROVIDES:${PN} += "libwx_gtk2u_media-suse.so.9.0.0()(64bit) libwx_gtk2u_media-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_media-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk2u_media-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk2u_media-suse9_0_0 libwx_gtk2u_media-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_core-suse.so.9.0.0()(64bit) libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
