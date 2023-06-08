SUMMARY = "2D molecular structures editor"
DESCRIPTION = "The purpose of this editor to help drawing molecules. \
Features: \
 * open, save and import in all formats supported by the OpenBabel library \
 * export to Scalable Vector Graphics (SVG) and a number of common used bitmap \
   formats \
 * print and export your document to PDF"
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3"

RPM_NAME = "molsketch-0.7.3-1.3.aarch64.rpm"
RPM_HASH = "d1c46d112958d9df224df5affdaa39fb031fb31703c77dbd336f39f5bc4e1395eabfcbe13e182c9c2e0a1599a73c13cc268ccd3041d3403d77191e88afc01c73"

RPROVIDES:${PN} += "application() application(molsketch.desktop) libmolsketch.so()(64bit) libobabeliface.so()(64bit) metainfo() metainfo(net.sourceforge.molsketch.appdata.xml) molsketch molsketch(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenbabel.so.7()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
