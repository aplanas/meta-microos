SUMMARY = "Graphical User Interface for the maxima Computer Algebra System"
DESCRIPTION = "wxMaxima is a GUI for the computer algebra system maxima \
based on wxWidgets."
LICENSE = "GPL-2.0-or-later"

PV = "23.05.0"

RPM_NAME = "wxMaxima-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "a9d8d9dddc2933b806373dc24b36a945559996d4988228ac468d445551143dd4490c05452e6cac4d557ab6169af9cc99c868b16ae6945071d9725e636b8e96da"

RPROVIDES:${PN} += "application() \
application(io.github.wxmaxima_developers.wxMaxima.desktop) \
metainfo() \
metainfo(io.github.wxmaxima_developers.wxMaxima.appdata.xml) \
mimehandler(text/x-maxima-out) \
mimehandler(text/x-maximasession) \
mimehandler(text/x-wxmathml) \
mimehandler(text/x-wxmaxima-batch) \
wxMaxima \
wxMaxima(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnuplot \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_net-suse.so.9.0.0()(64bit) \
libwx_baseu_net-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_richtext-suse.so.9.0.0()(64bit) \
libwx_gtk3u_richtext-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_webview-suse.so.9.0.0()(64bit) \
libwx_gtk3u_webview-suse.so.9.0.0(WXU_3.2)(64bit) \
maxima"

inherit rpm
