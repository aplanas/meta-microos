SUMMARY = "C++ toolkit for developing constraint-based systems"
DESCRIPTION = "Gecode is an open source C++ toolkit for developing constraint-based \
systems and applications. Gecode provides a constraint solver with \
state-of-the-art performance while being modular and extensible."
LICENSE = "MIT"

PV = "6.3.0~git20211208.6b09bea4"

RPM_NAME = "libgecode51-6.3.0~git20211208.6b09bea4-1.5.aarch64.rpm"
RPM_HASH = "d9ff2647bbc60c73a26ed766b6fe3cad15a02436850c45bf7f4bba991a45964cb009bbb52eb5b07c12b88febbc5ff5b527752e09bc180144860aa71f14784709"

RPROVIDES:${PN} += "libgecode51 libgecode51(aarch-64) libgecodedriver.so.51()(64bit) libgecodefloat.so.51()(64bit) libgecodeint.so.51()(64bit) libgecodekernel.so.51()(64bit) libgecodeminimodel.so.51()(64bit) libgecodesearch.so.51()(64bit) libgecodeset.so.51()(64bit) libgecodesupport.so.51()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
