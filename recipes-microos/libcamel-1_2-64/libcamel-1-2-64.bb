SUMMARY = "Evolution Data Server's Messaging Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for messaging."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "libcamel-1_2-64-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "7ab35bcf4b0d8e90c06d6527428532bf6dce7c927b826bf252e776c29cd6c495066ab66b1e49c5c31fff6fefe59dde1ec3c51a10e7398d138cf86cf8cd04cd87"

RPROVIDES:${PN} += "libcamel-1.2.so.64()(64bit) libcamel-1_2-64 libcamel-1_2-64(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libicuuc.so.72()(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.12)(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.3)(64bit) libnss3.so(NSS_3.4)(64bit) libnss3.so(NSS_3.7)(64bit) libnss3.so(NSS_3.9.2)(64bit) libsmime3.so()(64bit) libsmime3.so(NSS_3.2)(64bit) libsmime3.so(NSS_3.4)(64bit) libsmime3.so(NSS_3.4.1)(64bit) libsmime3.so(NSS_3.6)(64bit) libsqlite3.so.0()(64bit) libssl3.so()(64bit) libssl3.so(NSS_3.2)(64bit) libz.so.1()(64bit)"

inherit rpm
