SUMMARY = "Library for transferring data from URLs"
DESCRIPTION = "The cURL shared library for accessing data using different \
network protocols."
LICENSE = "curl"

PV = "8.0.1"

RPM_NAME = "libcurl4-8.0.1-1.1.aarch64.rpm"
RPM_HASH = "6cc82e9608d200957e6d3832f28d937c3bc67f91962475fb1e1761783c277bff97767d89bf592055da0a58d7851a609249482dd5cb66bc1db9154e08650ab61c"

RPROVIDES:${PN} += "libcurl.so.4()(64bit) libcurl4 libcurl4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrotlidec.so.1()(64bit) libc.so.6(GLIBC_2.36)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libidn2.so.0()(64bit) libidn2.so.0(IDN2_0.0.0)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libnghttp2.so.14()(64bit) libpsl.so.5()(64bit) libssh.so.4()(64bit) libssh.so.4(LIBSSH_4_5_0)(64bit) libssh.so.4(LIBSSH_4_8_1)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
