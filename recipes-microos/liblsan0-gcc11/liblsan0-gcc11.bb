SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "11.3.1+git2076"

RPM_NAME = "liblsan0-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "93dff3a0b79bb8605a055762f88d2996bb25f8c0fac8dc5ca44d055cb3f731bb45eb403fb20d14ce3fec7446ab6458676ae390a5325f17e2961b916a5ed4dc2c"

RPROVIDES:${PN} += "liblsan.so.0()(64bit) liblsan0 liblsan0-gcc11 liblsan0-gcc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
