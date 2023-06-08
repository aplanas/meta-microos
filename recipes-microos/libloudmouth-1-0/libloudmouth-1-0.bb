SUMMARY = "Jabber Client Library Written in C"
DESCRIPTION = "Loudmouth is a lightweight and easy-to-use C library for programming \
with the Jabber protocol. It is designed to be easy to get started with \
and yet extensible to let you do anything the Jabber protocol allows."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.4"

RPM_NAME = "libloudmouth-1-0-1.5.4-1.7.aarch64.rpm"
RPM_HASH = "5a0e5a8b0b74a7b6e8d5fc87a68e0f70e3c1a636b553a92c3cf75139dc0a10ac8a3907e9622f22f0083d88832f7ecdf7121b41e1882c6a6bd62231b76cfe0abb"

RPROVIDES:${PN} += "libloudmouth-1-0 libloudmouth-1-0(aarch-64) libloudmouth-1.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libidn.so.12()(64bit) libidn.so.12(LIBIDN_1.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
