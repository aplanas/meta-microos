SUMMARY = "Library to import QuarkXPress documents"
DESCRIPTION = "libqxp is library providing ability to interpret and import QuarkXPress \
document formats into various applications. Currently it only supports \
QuarkXPress 3.1-4.1."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libqxp-0_0-0-0.0.2-1.19.aarch64.rpm"
RPM_HASH = "438f178e43d5cd093bf81e75d2b817161235f43daa054c9d05633356bbf11fbe2f3f4182c920df9ba9389096013aae57aef9f624bc0b46c11378184d0efffa7d"

RPROVIDES:${PN} += "libqxp-0.0.so.0()(64bit) libqxp-0_0-0 libqxp-0_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) librevenge-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
