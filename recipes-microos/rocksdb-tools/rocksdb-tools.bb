SUMMARY = "Utility tools for RocksDB"
DESCRIPTION = "RocksDB is a high performance embedded database for key-value data. \
This package contains utility tools for RocksDB."
LICENSE = "(Apache-2.0 | GPL-2.0-only) & BSD-2-Clause"

PV = "8.1.1"

RPM_NAME = "rocksdb-tools-8.1.1-1.1.aarch64.rpm"
RPM_HASH = "ad44f0ad47a603a3b92a6a76c025bc1f0d99d1fc68864b7122cea36987eadfbb45eff86afe944b246f95cd521b89c6e0bb410d9e8c7bc42f3ae504563c079b8d"

RPROVIDES:${PN} += "rocksdb-tools rocksdb-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) librocksdb.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
