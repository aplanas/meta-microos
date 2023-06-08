SUMMARY = "Development files for wxGTK3-3_2"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains all files needed for developing with wxGTK3-3_2. \
 \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxGTK3-3_2/README.SUSE to pick a correct variant."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxGTK3-3_2-devel-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "e4026fe4a7b1b9c19ee5657e7118616735c935e590029649681e460fa480aea7a8d053d94b510904f30634db7f05bd3b30ec4431cca4d875dacf0b766c3b190f"

RPROVIDES:${PN} += "wxGTK3-3_2-devel wxGTK3-3_2-devel(aarch-64) wxGTK3-devel wxWidgets-any-devel"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_base-suse-devel libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse.so.9.0.0()(64bit) libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_adv-suse9_0_0 libwx_gtk3u_aui-suse9_0_0 libwx_gtk3u_core-suse9_0_0 libwx_gtk3u_gl-suse9_0_0 libwx_gtk3u_html-suse9_0_0 libwx_gtk3u_media-suse9_0_0 libwx_gtk3u_propgrid-suse9_0_0 libwx_gtk3u_qa-suse9_0_0 libwx_gtk3u_ribbon-suse9_0_0 libwx_gtk3u_richtext-suse9_0_0 libwx_gtk3u_stc-suse9_0_0 libwx_gtk3u_webview-suse9_0_0 libwx_gtk3u_xrc-suse9_0_0 pkgconfig(gl) pkgconfig(glu) pkgconfig(gtk+-3.0)"

inherit rpm
