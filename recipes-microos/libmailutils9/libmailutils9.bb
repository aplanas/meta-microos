SUMMARY = "Generalized mailbox access library"
DESCRIPTION = "At the core of Mailutils is 'libmailutils', a library which provides \
an API for accessing a generalized mailbox.  A set of complementary \
libraries provide methods for handling particular mailbox \
implementations: UNIX mailbox, Maildir, MH, POP3, IMAP4, even SMTP."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.15"

RPM_NAME = "libmailutils9-3.15-2.4.aarch64.rpm"
RPM_HASH = "ea0a1ec5b306c316899bbed17fe53e6954c97dbe32f5fb1983aac05d8249e39bb0c5241185ea34b4ec9435220adf777f09f659e5799708904924a36229efcb37"

RPROVIDES:${PN} += "libmailutils.so.9()(64bit) libmailutils9 libmailutils9(aarch-64) libmu_auth.so.9()(64bit) libmu_dbm.so.9()(64bit) libmu_dotmail.so.9()(64bit) libmu_imap.so.9()(64bit) libmu_maildir.so.9()(64bit) libmu_mailer.so.9()(64bit) libmu_mbox.so.9()(64bit) libmu_mh.so.9()(64bit) libmu_pop.so.9()(64bit) libmu_py.so.9()(64bit) libmu_scm.so.9()(64bit) libmu_sieve.so.9()(64bit) libmuaux.so.9()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgsasl.so.7()(64bit) libgsasl.so.7(LIBGSASL_1.1)(64bit) libguile-3.0.so.1()(64bit) libguile-3.0.so.1(GUILE_2.0)(64bit) libkyotocabinet.so.16()(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libltdl.so.7()(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpython3.10.so.1.0()(64bit)"

inherit rpm
