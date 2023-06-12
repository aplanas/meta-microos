SUMMARY = "EPS image format plugin for Qt"
DESCRIPTION = "This plugin provides support for the EPS document format for QtGui. As \
it invokes ghostscript for conversion, it should only be used in trusted \
environments."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kimageformats-eps-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "02028e54389396597e89ddfb888253a0fdf8b00d0f75bce9b940e470a84b9c5c8b69121cd2fd2e9956993c5ba20f00068c0ccc6f5d200e05bc63f3e591ddb94e"

RPROVIDES:${PN} += "kimageformats-eps kimageformats-eps(aarch-64)"
RDEPENDS:${PN} += "ghostscript ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
