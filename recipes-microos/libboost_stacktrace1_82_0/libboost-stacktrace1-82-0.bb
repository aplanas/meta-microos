SUMMARY = "Boost.Stacktrace runtime library"
DESCRIPTION = "This package contains the Boost.Stacktrace runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_stacktrace1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "f6909a4770da4bc001d891bc3ccd165c25e29aaa10592e867529e9938e091a73d54f8ab473938057159ee1233952d0c2928ea523a5e477928d58906166b53c96"

RPROVIDES:${PN} += "libboost_stacktrace1_82_0 libboost_stacktrace1_82_0(aarch-64) libboost_stacktrace_addr2line.so.1.82.0()(64bit) libboost_stacktrace_basic.so.1.82.0()(64bit) libboost_stacktrace_noop.so.1.82.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
