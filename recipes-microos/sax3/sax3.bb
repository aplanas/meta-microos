SUMMARY = "A Graphical Configuration Tool for X"
DESCRIPTION = "A graphical utility for configuring X server settings. It can run without X with a graphical interface. \
 \
Authors: \
_______ \
Manu Gupta \
Michal Hrusecky"
LICENSE = "GPL-3.0"

PV = "0.1.2"

RPM_NAME = "sax3-0.1.2-6.41.aarch64.rpm"
RPM_HASH = "1c9898ea915a65c14f8037a0d147e9df001125368f21a17fa4f3f3e6f15cfb5855661c08f35dd3f9a381b64983513f91fdda64d9212d7fa474794a02144b5817"

RPROVIDES:${PN} += "application() \
application(sax3.desktop) \
libsax3-yuif.so()(64bit) \
sax3 \
sax3(aarch-64)"
RDEPENDS:${PN} += "augeas \
augeas-lenses \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaugeas.so.0()(64bit) \
libaugeas.so.0(AUGEAS_0.1.0)(64bit) \
libaugeas.so.0(AUGEAS_0.8.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libyui.so.16()(64bit)"

inherit rpm
