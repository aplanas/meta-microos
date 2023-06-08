SUMMARY = "POCO C++ Server Page Compiler"
DESCRIPTION = "This program compiles web pages containing embedded C++ code into a C++ class \
that can be used with the HTTP server from the POCO Net library."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "poco-cpspc-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "660b6063eae6341461d8792c8fd5edf53f9a7deeb2541202ea4a91ed5f491be25eea0add709778410088947f89dfb882f3a4b4cc8b3b2dc46a2680839172725c"

RPROVIDES:${PN} += "poco-cpspc poco-cpspc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libPocoFoundation.so.92()(64bit) libPocoNet.so.92()(64bit) libPocoUtil.so.92()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
