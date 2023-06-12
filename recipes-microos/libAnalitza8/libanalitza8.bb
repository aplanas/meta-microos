SUMMARY = "A library to add mathematical features to programs"
DESCRIPTION = "The Analitza library lets developers add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libAnalitza8-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "33fcd73cc5de630df8aea1f1de705e15b53d2b024c79f8e607312e98264fcecd32be4bd732bac1d9ade790ce80f45d1cc33cbe9fbb4ab8e8f224d3b8c0ade17e"

RPROVIDES:${PN} += "libAnalitza.so.8()(64bit) libAnalitza8 libAnalitza8(aarch-64) libAnalitzaGui.so.8()(64bit) libAnalitzaPlot.so.8()(64bit) libAnalitzaWidgets.so.8()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig analitza ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
