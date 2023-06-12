SUMMARY = "wxWidgets media class library"
DESCRIPTION = "wxMediaCtrl is a class for displaying types of media, such as videos, \
audio files, natively through native codecs."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_media-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "47b819fc27a3a6403d7aafd1d791c697ce9cc497c23c0090ba0721808731cdff56e156542b5c72d7dc37825a0abcc8301269982c1c1640e2ec92da4aa1f14ad1"

RPROVIDES:${PN} += "libwx_gtk3u_media-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_media-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_media-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_gtk3u_media-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) \
libwx_gtk3u_media-suse-nostl9_0_0 \
libwx_gtk3u_media-suse-nostl9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
