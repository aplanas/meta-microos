SUMMARY = "Tools to work with publications in Microsoft Publisher file-format"
DESCRIPTION = "Command line tools to work with publications in Microsoft Publisher file-format."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libmspub-tools-0.1.4-2.23.aarch64.rpm"
RPM_HASH = "74c65d71cfd6377084c6005ea80182d27d81831311b5a4d72b8114063129d33c349b6cb90b266a53523cdb35091e0e03c21f530748d7c085e174e55190dcd252"

RPROVIDES:${PN} += "libmspub-tools libmspub-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmspub-0.1.so.1()(64bit) librevenge-0.0.so.0()(64bit) librevenge-generators-0.0.so.0()(64bit) librevenge-stream-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
