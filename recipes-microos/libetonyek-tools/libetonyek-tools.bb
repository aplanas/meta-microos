SUMMARY = "Tools to work with Apple Keynote presentations"
DESCRIPTION = "This package contains tools to work with Apple Keynote presentations"
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-tools-0.1.10-1.11.aarch64.rpm"
RPM_HASH = "7a08ce46fdc03d0320c4e74d7ece0e0e29f51a306b384832a28551be4708beed12ad9c8bacf6e096cebee8ef493388429733ce255f432127b841335805541aa9"

RPROVIDES:${PN} += "libetonyek-tools libetonyek-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libetonyek-0.1.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) librevenge-0.0.so.0()(64bit) librevenge-generators-0.0.so.0()(64bit) librevenge-stream-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
