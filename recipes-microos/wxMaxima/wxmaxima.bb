SUMMARY = "Graphical User Interface for the maxima Computer Algebra System"
DESCRIPTION = "wxMaxima is a GUI for the computer algebra system maxima \
based on wxWidgets."
LICENSE = "GPL-2.0-or-later"

PV = "23.03.0"

RPM_NAME = "wxMaxima-23.03.0-1.4.aarch64.rpm"
RPM_HASH = "83b302b776f88d5d84ca654bebcf00a0ebdaf05d4ba8a9abf0bf4539392a6a20ae696466ee6ce55b1b6f66290f30344d906828baeeead9169fd4c0a6d3da57e0"

RPROVIDES:${PN} += "application() application(io.github.wxmaxima_developers.wxMaxima.desktop) metainfo() metainfo(io.github.wxmaxima_developers.wxMaxima.appdata.xml) mimehandler(text/x-maxima-out) mimehandler(text/x-maximasession) mimehandler(text/x-wxmathml) mimehandler(text/x-wxmaxima-batch) wxMaxima wxMaxima(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnuplot ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_net-suse.so.9.0.0()(64bit) libwx_baseu_net-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse.so.9.0.0()(64bit) libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_aui-suse.so.9.0.0()(64bit) libwx_gtk3u_aui-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_richtext-suse.so.9.0.0()(64bit) libwx_gtk3u_richtext-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_webview-suse.so.9.0.0()(64bit) libwx_gtk3u_webview-suse.so.9.0.0(WXU_3.2)(64bit) maxima"

inherit rpm
