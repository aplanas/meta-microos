SUMMARY = "IMAP4 daemon from GNU Mailutils"
DESCRIPTION = "GNU 'imap4d' is a daemon implementing IMAP4 rev1 protocol for accessing \
and handling electronic mail messages on a server."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-imap4d-3.16-1.2.aarch64.rpm"
RPM_HASH = "15679c1dd5a18d2b6220b7c9347a7ea1c2caecd27431cd1ce10735e73588633ada90861a379a518fd52bfc64ba8f5e60febe5c9fce4459a1721ce5ae5a3070ab"

RPROVIDES:${PN} += "mailutils-imap4d \
mailutils-imap4d(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgsasl.so.7()(64bit) \
libgsasl.so.7(LIBGSASL_1.1)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libmailutils.so.9()(64bit) \
libmu_auth.so.9()(64bit) \
libmu_dotmail.so.9()(64bit) \
libmu_maildir.so.9()(64bit) \
libmu_mbox.so.9()(64bit) \
libmu_mh.so.9()(64bit) \
libmuaux.so.9()(64bit) \
libwrap.so.0()(64bit)"

inherit rpm
