SUMMARY = "Distributed version control system based on a theory of patches"
DESCRIPTION = "Pijul is a distributed version control system. Its distinctive feature is to be \
based on a theory of patches, which makes it really distributed."
LICENSE = "GPL-2.0-only"

PV = "1.0.0~beta.4"

RPM_NAME = "pijul-1.0.0~beta.4-1.3.aarch64.rpm"
RPM_HASH = "ba128098bef5ef6f8cfd6ae3a47472f193050a9939702a26bc6481ea7a3afdcbea08daeaf7d3e0211dc0238510712c27fd4d886c4431b91a4a9164cd7302d56a"

RPROVIDES:${PN} += "pijul pijul(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit)"

inherit rpm
