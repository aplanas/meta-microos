SUMMARY = "Library for parsing the Corel Draw file format structure"
DESCRIPTION = "libcdr is a library for parsing the Corel Draw file format structure."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libcdr-0_1-1-0.1.7-1.17.aarch64.rpm"
RPM_HASH = "a6336d212cf86ecb4f93ec97148619cb8ace867a516b095239cc5a3389c854b81172facd12bb9cabb1f8a1bd1b817217cd21edc834cd2c904613ce67c56ca2c2"

RPROVIDES:${PN} += "libcdr-0.1.so.1()(64bit) libcdr-0_1-1 libcdr-0_1-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) librevenge-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
