SUMMARY = "Stand-alone obby server"
DESCRIPTION = "sobby is a stand-alone obby server. It currently runs under Unix-like \
platforms only."
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "sobby-0.4.8-11.15.aarch64.rpm"
RPM_HASH = "d687ad0f5de9db6bdcc28ba8a56a8d845d1c282cc177f8f91fc9b9247c9808109f4bbf85afa9a96b934186d8a5041d60e8f63e2b663028ca409e41601a59e493"

RPROVIDES:${PN} += "sobby \
sobby(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavahi-glib.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libnet6-1.3.so.0()(64bit) \
libobby-0.4.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml++-2.6.so.2()(64bit)"

inherit rpm
