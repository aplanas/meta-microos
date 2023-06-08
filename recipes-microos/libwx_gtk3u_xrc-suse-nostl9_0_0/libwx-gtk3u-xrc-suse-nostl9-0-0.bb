SUMMARY = "wxWidgets's XML-based resource system"
DESCRIPTION = "The XML-based resource system of wxWidgets, known as XRC, allows user \
interface elements such as dialogs, menu bars and toolbars, to be \
stored in text files and loaded into the application at run-time."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_xrc-suse-nostl9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "ecd095c4cbe51031c53040a80e82a31b19aee990f8b759e711e374cd2a279908cdabd7186b24eda690d20b32b0179aca635b89affa66e0458162a0f5dad5863e"

RPROVIDES:${PN} += "libwx_gtk3u_xrc-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_xrc-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_xrc-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_xrc-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_xrc-suse-nostl9_0_0 libwx_gtk3u_xrc-suse-nostl9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.9.0.0()(64bit) libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse-nostl.so.9.0.0()(64bit) libwx_baseu_xml-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_html-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_html-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
