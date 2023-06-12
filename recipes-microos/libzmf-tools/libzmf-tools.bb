SUMMARY = "Tools for converting the Zoner ZMF files"
DESCRIPTION = "Tools to work with the Zoner ZMF files, based on librevenge."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-tools-0.0.2-1.44.aarch64.rpm"
RPM_HASH = "68a786a4d981f7fbf7805dbdbbfd8f1348b3cdd42b52948b7145383e2b9f97b5e886984659ab65cbe72e0b080dde54e146fc03f2910af3116cbb90aef89d7752"

RPROVIDES:${PN} += "libzmf-tools libzmf-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) librevenge-0.0.so.0()(64bit) librevenge-generators-0.0.so.0()(64bit) librevenge-stream-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libzmf-0.0.so.0()(64bit)"

inherit rpm
