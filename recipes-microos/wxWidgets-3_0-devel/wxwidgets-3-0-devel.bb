SUMMARY = "Development files for GTK2-backed wxWidgets 3.0"
DESCRIPTION = "wxWidgets is a C++ library for cross-platform GUI development. \
With wxWidgets, you can create applications for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source code. \
 \
This package contains all files needed for developing with wxGTK2. \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxWidgets-3_0/README.SUSE to pick a correct variant."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "wxWidgets-3_0-devel-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "6c217c8828e81070cc8c0ba8ead57b47fddba44cee805c988b76108b4b0fad5a9cc5df1d3199aa606b8c964c0820ff0bc2bed9bd70d0cc2b94d0f4de5ff52862"

RPROVIDES:${PN} += "wxGTK-devel wxGTK2-devel wxWidgets-3_0-devel wxWidgets-3_0-devel(aarch-64) wxWidgets-any-devel wxWidgets-devel"
RDEPENDS:${PN} += "/bin/sh gtk2-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_baseu-suse3_0_5 libwx_baseu_net-suse3_0_5 libwx_baseu_xml-suse.so.3.0.5()(64bit) libwx_baseu_xml-suse.so.3.0.5(WXU_3.0)(64bit) libwx_baseu_xml-suse3_0_5 libwx_gtk2u_adv-suse3_0_5 libwx_gtk2u_aui-suse3_0_5 libwx_gtk2u_core-suse3_0_5 libwx_gtk2u_gl-suse3_0_5 libwx_gtk2u_html-suse3_0_5 libwx_gtk2u_media-suse3_0_5 libwx_gtk2u_propgrid-suse3_0_5 libwx_gtk2u_qa-suse3_0_5 libwx_gtk2u_ribbon-suse3_0_5 libwx_gtk2u_richtext-suse3_0_5 libwx_gtk2u_stc-suse3_0_5 libwx_gtk2u_xrc-suse3_0_5 pkgconfig(gl) pkgconfig(glu)"

inherit rpm
