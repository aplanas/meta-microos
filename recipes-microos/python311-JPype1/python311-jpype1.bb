SUMMARY = "Python to Java bridge"
DESCRIPTION = "A Python to Java bridge."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python311-JPype1-1.4.1-1.4.aarch64.rpm"
RPM_HASH = "0559a1c67ef3d0dc2087e19f7ec374a598f46605654f4a0904b643c53aef5e6c125306eb0f3a7df1a4b0cf40b31c4fcdb9c1748decb544f4b1a94876f92eaedd"

RPROVIDES:${PN} += "python3.11dist(jpype1) python311-JPype1 python311-JPype1(aarch-64) python3dist(jpype1)"
RDEPENDS:${PN} += "java-15-openjdk-headless ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
