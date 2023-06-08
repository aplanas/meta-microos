SUMMARY = "A wxWidgets CHM document viewer"
DESCRIPTION = "xCHM is a GUI frontend for CHMLIB, written with wxGTK. It is able to \
display the topics tree, work with displayed pages history, print the \
current page, work with bookmarks, change fonts and fast search \
through all the pages of the loaded .chm document."
LICENSE = "GPL-2.0-or-later"

PV = "1.35"

RPM_NAME = "xchm-1.35-1.4.aarch64.rpm"
RPM_HASH = "bbf82dcccc288bfece35c61c6950b318c96b474845f19d603aad3c864a3fbe1b7df821afdab7993c28da59a5b1cb54a301baf1f2307905bd6e9850af6358368d"

RPROVIDES:${PN} += "application() application(xchm.desktop) metainfo() metainfo(xchm.appdata.xml) mimehandler(application/vnd.ms-htmlhelp) mimehandler(application/x-chm) xchm xchm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libchm.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_net-suse.so.9.0.0()(64bit) libwx_baseu_net-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_aui-suse.so.9.0.0()(64bit) libwx_gtk2u_aui-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_core-suse.so.9.0.0()(64bit) libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_html-suse.so.9.0.0()(64bit) libwx_gtk2u_html-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
