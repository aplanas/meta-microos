SUMMARY = "HFST spell checker runtime libraries"
DESCRIPTION = "HFST spell checker Runtime libraries for hfst-ospell"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "libhfstospell11-0.5.1-4.3.aarch64.rpm"
RPM_HASH = "fb6ba26d359323104a0fabf71e0d09d79e40779390e8c7c712ec2cade76885f83fb17e56b8578ce35443f8eed5a3bf7e7bf2716650821653d9f00d8f94ecb3f7"

RPROVIDES:${PN} += "libhfstospell libhfstospell.so.11()(64bit) libhfstospell11 libhfstospell11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
