SUMMARY = "Implementation of the SASL framework and a few common SASL mechanisms"
DESCRIPTION = "GNU SASL is an implementation of the Simple Authentication and \
Security Layer framework and a few common SASL mechanisms. SASL is \
used by network servers (e.g., IMAP, SMTP) to request authentication \
from clients, and in clients to authenticate against servers."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libgsasl7-1.10.0-6.1.aarch64.rpm"
RPM_HASH = "fe5d06595872fe9c32e615fc932ca55e24c8200be61069108fe3c070a1e7b8e4681315ba25db98dbbdf7f482622605dec6c38e1dfd01d7354ea6895172a80adc"

RPROVIDES:${PN} += "libgsasl libgsasl.so.7()(64bit) libgsasl.so.7(LIBGSASL_1.1)(64bit) libgsasl.so.7(LIBGSASL_1.10)(64bit) libgsasl.so.7(LIBGSASL_1.4)(64bit) libgsasl7 libgsasl7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libidn.so.12()(64bit) libidn.so.12(LIBIDN_1.0)(64bit) libntlm.so.0()(64bit)"

inherit rpm
