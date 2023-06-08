SUMMARY = "wxWidgets media class library"
DESCRIPTION = "wxMediaCtrl is a class for displaying types of media, such as videos, \
audio files, natively through native codecs."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_media-suse-nostl9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "5607710cf83796b4107352289d8c4fced9f993fc9a220556bc6339ba449f0c14daf2190f6d9fcc58fb6943cf7f72af9e1a4e05ff86c469123124f869a5063e13"

RPROVIDES:${PN} += "libwx_gtk3u_media-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_media-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_media-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_media-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_media-suse-nostl9_0_0 libwx_gtk3u_media-suse-nostl9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libgtk-3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.9.0.0()(64bit) libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
