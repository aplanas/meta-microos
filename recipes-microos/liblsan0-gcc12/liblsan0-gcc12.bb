SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "liblsan0-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "1281285c92c1c151c098ab840df569986fb79511c7f5e3bd5ecaa864445c7da21b68b2c1fc1b66379707270becac0664f7564c7c489c21c6a932a77662aa5cbd"

RPROVIDES:${PN} += "liblsan.so.0()(64bit) \
liblsan0 \
liblsan0-gcc12 \
liblsan0-gcc12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
