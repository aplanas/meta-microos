SUMMARY = "Linux Studio Plugins (LADSPA)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the LADSPA version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.6"

RPM_NAME = "ladspa-lsp-plugins-1.2.6-2.1.aarch64.rpm"
RPM_HASH = "cc5e88526e31ee3f9a2aeb7a71024a6ed9203c6a5dc5226c6b0c00bccb6a331308823f42009ebca9a9f00b42194d9539af9751880c4c0961a9a0e243b77d6f7a"

RPROVIDES:${PN} += "ladspa-lsp-plugins ladspa-lsp-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) lsp-plugins-common"

inherit rpm
