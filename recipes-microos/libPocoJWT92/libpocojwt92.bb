SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoJWT92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "715217d84529d9e4f5f5d3a2c5bb97be193dda13c16da63aa85f0b467db3e7138b639cbe5cb6ad6d5686961db0d97d9c8760227997da8efbac4236cc2fd4336f"

RPROVIDES:${PN} += "libPocoJWT.so.92()(64bit) \
libPocoJWT92 \
libPocoJWT92(aarch-64) \
poco-jwt"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libPocoCrypto.so.92()(64bit) \
libPocoFoundation.so.92()(64bit) \
libPocoJSON.so.92()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
