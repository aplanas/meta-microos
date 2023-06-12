SUMMARY = "Library for transferring data from URLs"
DESCRIPTION = "The cURL shared library for accessing data using different \
network protocols."
LICENSE = "curl"

PV = "8.1.2"

RPM_NAME = "libcurl4-8.1.2-1.1.aarch64.rpm"
RPM_HASH = "4f1480e96020f5d7af4936a913f97dbfead6c53800f70778ee1647f1561fafc673e5869ee5a45ec093576713abac97c2509b38ac56de4bc7ac7d6da9df572f53"

RPROVIDES:${PN} += "libcurl.so.4()(64bit) libcurl4 libcurl4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrotlidec.so.1()(64bit) libc.so.6(GLIBC_2.36)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libidn2.so.0()(64bit) libidn2.so.0(IDN2_0.0.0)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libnghttp2.so.14()(64bit) libpsl.so.5()(64bit) libssh.so.4()(64bit) libssh.so.4(LIBSSH_4_5_0)(64bit) libssh.so.4(LIBSSH_4_8_1)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
