SUMMARY = "Thrift Zlib API"
DESCRIPTION = "A shared library from the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthriftz-0_17_0-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "b709910260723d09459f100e14805f67e2d35207d952535caeb2a37f894b4a4d4c38978e884a3dd1924ac6ca6fc23fe405eadb6086a1b9798df2564fcb9e3251"

RPROVIDES:${PN} += "libthriftz-0.17.0.so()(64bit) libthriftz-0_17_0 libthriftz-0_17_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit)"

inherit rpm
