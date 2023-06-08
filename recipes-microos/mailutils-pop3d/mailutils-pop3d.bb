SUMMARY = "POP3 daemon from GNU Mailutils"
DESCRIPTION = "The 'pop3d' daemon implements the Post Office Protocol Version 3 server."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.15"

RPM_NAME = "mailutils-pop3d-3.15-2.4.aarch64.rpm"
RPM_HASH = "b2532144f30cffa1ea9765fae72ccf21feefa752db877fd32b0809753f5f7d3291d59b4c9f3947bd8142fb5a1f8f0c9edf516f623230f87973eab7dabb4701a1"

RPROVIDES:${PN} += "mailutils-pop3d mailutils-pop3d(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmailutils.so.9()(64bit) libmu_auth.so.9()(64bit) libmu_dbm.so.9()(64bit) libmu_dotmail.so.9()(64bit) libmu_maildir.so.9()(64bit) libmu_mbox.so.9()(64bit) libmu_mh.so.9()(64bit) libmuaux.so.9()(64bit) libunistring.so.5()(64bit) libwrap.so.0()(64bit)"

inherit rpm
