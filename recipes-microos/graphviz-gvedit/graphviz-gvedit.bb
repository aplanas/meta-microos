SUMMARY = "Graph editor based on Qt"
DESCRIPTION = "The Qt5 graph editor included with graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-gvedit-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "5106dca05010fc8d413e6f00d403cd35ef2f7903f49ecf7c5b69716b3c5293c64b5cdc5c86a494443024d26ec029c6caca375617843e2683d70a7fa3e2c8e0f5"

RPROVIDES:${PN} += "graphviz-gvedit graphviz-gvedit(aarch-64)"
RDEPENDS:${PN} += "graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcgraph.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgvc.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
