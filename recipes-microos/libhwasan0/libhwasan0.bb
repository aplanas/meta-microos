SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "libhwasan0-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "46423fb152cf526d6223852079d565f9d3365798bfee29a77a55b9dd5aedcde1e992fa5a857682646ec29a93625676d59f2a0d74565cc421fb4f087942ca9adc"

RPROVIDES:${PN} += "libhwasan.so.0()(64bit) libhwasan0 libhwasan0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
