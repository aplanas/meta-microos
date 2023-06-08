SUMMARY = "wxWidgets's XML-based resource system"
DESCRIPTION = "The XML-based resource system of wxWidgets, known as XRC, allows user \
interface elements such as dialogs, menu bars and toolbars, to be \
stored in text files and loaded into the application at run-time."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_xrc-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "fdba5145b8bd0efd5568b0766fadf4f90b9af774f946e9fd5f8a4969e313c36a5f995d3d1ce1697a73296f7d39647074e274c54b9bdeab72d7063f22e6fbf3b0"

RPROVIDES:${PN} += "libwx_gtk2u_xrc-suse.so.9.0.0()(64bit) libwx_gtk2u_xrc-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_xrc-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk2u_xrc-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk2u_xrc-suse9_0_0 libwx_gtk2u_xrc-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse.so.9.0.0()(64bit) libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_core-suse.so.9.0.0()(64bit) libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_html-suse.so.9.0.0()(64bit) libwx_gtk2u_html-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
