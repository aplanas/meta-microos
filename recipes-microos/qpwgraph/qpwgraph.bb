SUMMARY = "PipeWire Graph Qt GUI Interface"
DESCRIPTION = "qpwgraph is a graph manager dedicated for PipeWire, using the \
Qt C++ framework, based and pretty much like the same of QjackCtl."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2"

RPM_NAME = "qpwgraph-0.4.2-1.1.aarch64.rpm"
RPM_HASH = "5f436317684dcb2c1060f0c6bb5e1ecbcd3a6b89d52faa38a3a4d9f4b3e19ecf8b7bdb9ad2b77feab7041cd5abb14b7d7644160ba8cf47edec33ee8bbee334fa"

RPROVIDES:${PN} += "application() application(org.rncbc.qpwgraph.desktop) metainfo() metainfo(org.rncbc.qpwgraph.metainfo.xml) mimehandler(application/x-qpwgraph-patchbay) qpwgraph qpwgraph(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.4)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libQt6Xml.so.6()(64bit) libQt6Xml.so.6(Qt_6)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpipewire-0.3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
