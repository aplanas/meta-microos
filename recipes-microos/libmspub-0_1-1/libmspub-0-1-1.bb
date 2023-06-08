SUMMARY = "Microsoft Publisher file format parser library"
DESCRIPTION = "libmspub is a library for parsing the Corel Draw file format structure. It is \
cross-platform, at the moment it can be build on Microsoft Windows and Linux."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libmspub-0_1-1-0.1.4-2.23.aarch64.rpm"
RPM_HASH = "e13f18d2d1e152d1af753e3c728248953d06527df91810e10b996294974058049cd5803cddcf6e0c178d5c42aa216e3fecdb3484ef34f709c8c263ceef7ee480"

RPROVIDES:${PN} += "libmspub-0.1.so.1()(64bit) libmspub-0_1-1 libmspub-0_1-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) librevenge-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit)"

inherit rpm
