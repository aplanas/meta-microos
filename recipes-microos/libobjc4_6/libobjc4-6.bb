SUMMARY = "GNUstep Objective-C Runtime"
DESCRIPTION = "The GNUstep Objective-C runtime is designed as a drop-in replacement for the \
GCC runtime.  It supports both a legacy and a modern ABI, allowing code \
compiled with old versions of GCC to be supported without requiring \
recompilation.  The modern ABI adds the following features: \
 \
- Non-fragile instance variables. \
- Protocol uniquing. \
- Object planes support. \
- Declared property introspection."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "libobjc4_6-2.1-2.3.aarch64.rpm"
RPM_HASH = "e4f2abecac50d2bb7c6b169415abdc72a54809b3ca269feea943b3bbb518b4bccbf3400ecefc5e33027ae41840e892b75380362e92e11a4345240a813cd272b6"

RPROVIDES:${PN} += "libobjc.so.4.6()(64bit) \
libobjc4_6 \
libobjc4_6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
