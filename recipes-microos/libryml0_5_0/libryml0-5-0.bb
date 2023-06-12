SUMMARY = "A library to parse and emit YAML"
DESCRIPTION = "ryml is a C++ library to parse and emit YAML. \
 \
ryml parses both read-only and in-situ source buffers; the resulting \
data nodes hold only views to sub-ranges of the source buffer. No \
string copies or duplications are done."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "libryml0_5_0-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "28f9a0a602437937304f3d8112ec10c5360e9b7e170382e8e4b0c01019629a102c6f5aafcf370a22865ea3385b00a02cf222dd008e245ff12f64123f14d8555e"

RPROVIDES:${PN} += "libryml.so.0.5.0()(64bit) \
libryml0_5_0 \
libryml0_5_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
