SUMMARY = "Subunit integration into cppunit"
DESCRIPTION = "Subunit integration into cppunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libcppunit_subunit0-1.4.2-2.2.aarch64.rpm"
RPM_HASH = "b9567f04a4dea01c129dd2cddd53ed2e38a4556828cf4e5ae12387e7dce9fa68def06dc0257a04f86b2b98878916e7e303c4b4bd057e08f5b5c6b8f0e9bc0fcb"

RPROVIDES:${PN} += "libcppunit_subunit.so.0()(64bit) libcppunit_subunit0 libcppunit_subunit0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) subunit(aarch-64)"

inherit rpm
