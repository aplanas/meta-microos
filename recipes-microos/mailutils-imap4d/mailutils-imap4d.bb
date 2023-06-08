SUMMARY = "IMAP4 daemon from GNU Mailutils"
DESCRIPTION = "GNU 'imap4d' is a daemon implementing IMAP4 rev1 protocol for accessing \
and handling electronic mail messages on a server."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.15"

RPM_NAME = "mailutils-imap4d-3.15-2.4.aarch64.rpm"
RPM_HASH = "023f4691e664ba8e439a4b07cf9324c21cd4c421de231724c99f5fe6ceef90f4caa13e77295dc268db4c2d4fa9496e5324bc2e49b0204f8bc93734d57d9c1f62"

RPROVIDES:${PN} += "mailutils-imap4d mailutils-imap4d(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgsasl.so.7()(64bit) libgsasl.so.7(LIBGSASL_1.1)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libmailutils.so.9()(64bit) libmu_auth.so.9()(64bit) libmu_dotmail.so.9()(64bit) libmu_maildir.so.9()(64bit) libmu_mbox.so.9()(64bit) libmu_mh.so.9()(64bit) libmuaux.so.9()(64bit) libwrap.so.0()(64bit)"

inherit rpm
