SUMMARY = "Development files for wxQt-3_2"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains all files needed for developing with wxQt-3_2. \
 \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxQt-3_2/README.SUSE to pick a correct variant."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxQt-3_2-devel-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "46569f7a18159df708b9e873e0462a2d2203748fc5ae32570f2bf2d42f596df94de995142f12f2193860640a84b3a663ead27a2bc4e7b1b729db6e17e4f9abf8"

RPROVIDES:${PN} += "wxQt-3_2-devel wxQt-3_2-devel(aarch-64) wxQt-devel wxWidgets-any-devel"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_base-suse-devel libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse.so.9.0.0()(64bit) libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) libwx_qtu_adv-suse9_0_0 libwx_qtu_aui-suse9_0_0 libwx_qtu_core-suse9_0_0 libwx_qtu_gl-suse9_0_0 libwx_qtu_html-suse9_0_0 libwx_qtu_media-suse9_0_0 libwx_qtu_propgrid-suse9_0_0 libwx_qtu_qa-suse9_0_0 libwx_qtu_ribbon-suse9_0_0 libwx_qtu_richtext-suse9_0_0 libwx_qtu_stc-suse9_0_0 libwx_qtu_xrc-suse9_0_0 pkgconfig(Qt5OpenGL) pkgconfig(Qt5Widgets) pkgconfig(gl) pkgconfig(glu)"

inherit rpm
