SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoDataSQLite92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "e9e6e76deb4a51d4074a1c5d506b9afdd8169b2a6769d703c93232e781f55a648e212ada5d8b1bc18a69d82436a7403f126b64733677a33b5a1178245ca175f5"

RPROVIDES:${PN} += "libPocoDataSQLite.so.92()(64bit) \
libPocoDataSQLite92 \
libPocoDataSQLite92(aarch-64) \
poco-datasqlite"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libPocoData.so.92()(64bit) \
libPocoFoundation.so.92()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
