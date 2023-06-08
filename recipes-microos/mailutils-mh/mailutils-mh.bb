SUMMARY = "MH mailbox format support for Mailutils"
DESCRIPTION = "The implementation provides an interface between Mailutils and Emacs \
using the mh-e module. \
 \
To use Mailutils MH with Emacs, add the following line to \
site-start.el or .gnu-emacs file: (load 'mailutils-mh')"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.15"

RPM_NAME = "mailutils-mh-3.15-2.4.aarch64.rpm"
RPM_HASH = "a5f38a0ab17d3eacfe092df4d39e9342be11dcc7bf2e3645215a258a480b968793b71ba8f4480bbbe905ec20d64aa749af04286344a2db1ebd3238fa60e9dd3d"

RPROVIDES:${PN} += "mailutils-mh mailutils-mh(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libguile-3.0.so.1()(64bit) libguile-3.0.so.1(GUILE_2.0)(64bit) libmailutils.so.9()(64bit) libmu_dotmail.so.9()(64bit) libmu_imap.so.9()(64bit) libmu_maildir.so.9()(64bit) libmu_mailer.so.9()(64bit) libmu_mbox.so.9()(64bit) libmu_mh.so.9()(64bit) libmu_pop.so.9()(64bit) libmu_py.so.9()(64bit) libmu_scm.so.9()(64bit) libmu_sieve.so.9()(64bit) libmuaux.so.9()(64bit) libreadline.so.8()(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libunistring.so.5()(64bit)"

inherit rpm
