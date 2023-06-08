SUMMARY = "Linux Studio Plugins (VST)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the VST version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.6"

RPM_NAME = "vst-lsp-plugins-1.2.6-2.1.aarch64.rpm"
RPM_HASH = "c819a48cfc73fd0aaaaad83c14a4a52ad407eb513ff6d8da3c823f16694b536dc929ee2dec6732d3e548c79b94e310edbc9471df89acc220149434da90f84337"

RPROVIDES:${PN} += "vst-lsp-plugins vst-lsp-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfreetype.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) lsp-plugins-common"

inherit rpm
