SUMMARY = "EchoLink library"
DESCRIPTION = "EchoLink communications library"
LICENSE = "GPL-2.0-only"

PV = "1.3.2"

RPM_NAME = "libecholib1_3-1.3.2-5.9.aarch64.rpm"
RPM_HASH = "cf0fd60b147de6f7381ecc4a68118b95bae724617a5c1d925f2ba95d08762316f519c61996c8503ac99b567df79d74b7da2ef56620c191fd48106c007af28fa9"

RPROVIDES:${PN} += "libecholib.so.1.3()(64bit) \
libecholib1_3 \
libecholib1_3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasyncaudio.so.1.6()(64bit) \
libasynccore.so.1.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgsm.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libspeex.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
