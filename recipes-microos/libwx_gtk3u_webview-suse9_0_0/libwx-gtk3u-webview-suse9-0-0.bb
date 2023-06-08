SUMMARY = "wxWidgets HTML/browser class library"
DESCRIPTION = "Library for a wxWidgets control that can be used to render web \
(HTML / CSS / JavaScript) documents."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_webview-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "0ef95b64b97043900062ed5c7c00809e61fc0831c06766b25a36b1c2f89ee5e0dd516f772556855c3e2a0e87be6d4f4373c4a5edd41d040b3ed03d92b7be0e9d"

RPROVIDES:${PN} += "libwx_gtk3u_webview-suse.so.9.0.0()(64bit) libwx_gtk3u_webview-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_webview-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_webview-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_webview-suse9_0_0 libwx_gtk3u_webview-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjavascriptcoregtk-4.0.so.18()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwebkit2gtk-4.0.so.37()(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
