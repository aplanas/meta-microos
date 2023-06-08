SUMMARY = "EPS image format plugin for Qt"
DESCRIPTION = "This plugin provides support for the EPS document format for QtGui. As \
it invokes ghostscript for conversion, it should only be used in trusted \
environments."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kimageformats-eps-5.105.0-2.1.aarch64.rpm"
RPM_HASH = "2ee2684c518ec92607ee28789785941183d1935b996b652c713825027422f8d5b53c6888f54258ec0e5a04607153b736664583a5da6e0dc1416c5cc370038387"

RPROVIDES:${PN} += "kimageformats-eps kimageformats-eps(aarch-64)"
RDEPENDS:${PN} += "ghostscript ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
