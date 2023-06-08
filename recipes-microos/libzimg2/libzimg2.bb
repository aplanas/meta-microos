SUMMARY = "Scaling, colorspace conversion, and dithering library"
DESCRIPTION = "The 'z' image library implements the commonly required image processing \
basics of scaling, colorspace conversion, and depth conversion."
LICENSE = "WTFPL"

PV = "3.0.4"

RPM_NAME = "libzimg2-3.0.4-1.5.aarch64.rpm"
RPM_HASH = "c1946e7b3b314a73a30bd636994452fb7b80ad916b4abc27b65ae438ac3ae00125b5c5fdab663aa8132b209167956897b65268a85b8df275a3d198fe78ff12d3"

RPROVIDES:${PN} += "libzimg.so.2()(64bit) libzimg2 libzimg2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
