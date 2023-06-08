SUMMARY = "AV1 video decoder — Command line utility"
DESCRIPTION = "libgav1 is a Main profile (0) & High profile (1) compliant AV1 decoder written \
in C++ and also offering a C API. \
 \
This package contains the gav1_decode commandline program."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "libgav1-tools-0.18.0-2.1.aarch64.rpm"
RPM_HASH = "3916c76b2b1b90be61f57806ffad0786fd0db0f861c3a26895d60df595dc930f223a65992b6bde084b36f695211b273c825329b01d19985f03f2c7d7a2bab7a3"

RPROVIDES:${PN} += "libgav1-tools libgav1-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libabsl_strings.so.2301.0.0()(64bit) libabsl_time.so.2301.0.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgav1.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
