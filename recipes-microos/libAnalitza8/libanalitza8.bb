SUMMARY = "A library to add mathematical features to programs"
DESCRIPTION = "The Analitza library lets developers add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libAnalitza8-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e15c1286c967f9be33075068daa31e2d5ceac8c65c4415c69863f969968cb8a9e93f5c6b05cf6666e4b3963bdd13e7af703d0a0e4d19fa5d5b49667ec04ddf88"

RPROVIDES:${PN} += "libAnalitza.so.8()(64bit) libAnalitza8 libAnalitza8(aarch-64) libAnalitzaGui.so.8()(64bit) libAnalitzaPlot.so.8()(64bit) libAnalitzaWidgets.so.8()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig analitza ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
