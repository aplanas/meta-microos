SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "poco-devel-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "ace6828e3d97589fb2210b9d496ca272e2009d57d638d650f38b1be33c5f4fd9288ac1bef90ae697f0b5f91f6b68111ab7e6e144b18c6f3f8bb2e4ceddd0bb69"

RPROVIDES:${PN} += "cmake(Poco) \
cmake(PocoActiveRecord) \
cmake(PocoCppParser) \
cmake(PocoCrypto) \
cmake(PocoData) \
cmake(PocoDataMySQL) \
cmake(PocoDataODBC) \
cmake(PocoDataSQLite) \
cmake(PocoEncodings) \
cmake(PocoFoundation) \
cmake(PocoJSON) \
cmake(PocoJWT) \
cmake(PocoMongoDB) \
cmake(PocoNet) \
cmake(PocoNetSSL) \
cmake(PocoPDF) \
cmake(PocoPrometheus) \
cmake(PocoRedis) \
cmake(PocoUtil) \
cmake(PocoXML) \
cmake(PocoZip) \
libpoco-devel \
poco-devel \
poco-devel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libPocoCppParser92 \
libPocoCrypto92 \
libPocoData92 \
libPocoDataMySQL92 \
libPocoDataODBC92 \
libPocoDataSQLite92 \
libPocoEncodings92 \
libPocoFoundation.so.92()(64bit) \
libPocoFoundation92 \
libPocoJSON92 \
libPocoJWT92 \
libPocoMongoDB92 \
libPocoNet92 \
libPocoNetSSL92 \
libPocoPDF92 \
libPocoPrometheus92 \
libPocoRedis92 \
libPocoUtil.so.92()(64bit) \
libPocoUtil92 \
libPocoXML.so.92()(64bit) \
libPocoXML92 \
libPocoZip92 \
libc.so.6(GLIBC_2.34)(64bit) \
libexpat-devel \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmysqlclient-devel \
libstdc++-devel \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
openssl-devel \
pcre-devel \
poco-cpspc \
unixODBC-devel"

inherit rpm
