SUMMARY = "Development files for wxWidgets-3_2"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains all files needed for developing with wxWidgets-3_2. \
 \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxWidgets-3_2/README.SUSE to pick a correct variant."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxWidgets-3_2-devel-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "bea99d99ff920a6e5ac3ec5442de9d27902d2000e94c19674ce77c48355957e9a5cd92af1c65427b55a540326ebe87c9d59deb43ab36b4822788c5b809d1e593"

RPROVIDES:${PN} += "wxGTK-devel wxGTK2-devel wxWidgets-3_2-devel wxWidgets-3_2-devel(aarch-64) wxWidgets-any-devel wxWidgets-devel"
RDEPENDS:${PN} += "/bin/sh gtk2-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_base-suse-devel libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse.so.9.0.0()(64bit) libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_adv-suse9_0_0 libwx_gtk2u_aui-suse9_0_0 libwx_gtk2u_core-suse9_0_0 libwx_gtk2u_gl-suse9_0_0 libwx_gtk2u_html-suse9_0_0 libwx_gtk2u_media-suse9_0_0 libwx_gtk2u_propgrid-suse9_0_0 libwx_gtk2u_qa-suse9_0_0 libwx_gtk2u_ribbon-suse9_0_0 libwx_gtk2u_richtext-suse9_0_0 libwx_gtk2u_stc-suse9_0_0 libwx_gtk2u_xrc-suse9_0_0 pkgconfig(gl) pkgconfig(glu)"

inherit rpm
