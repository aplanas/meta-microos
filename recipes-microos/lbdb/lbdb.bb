SUMMARY = "Address Database for mutt"
DESCRIPTION = "The Little Brother's Database (lbdb) consists of a set of small tools \
that collect mail addresses from several sources and offer these \
addresses to the external query feature of the Mutt mail reader. \
 \
To use the fetch address feature, put the following lines in your \
.procmailrc: \
 \
:0hc | lbdb-fetchaddr \
 \
To use the database in mutt, put the following line into your .muttrc: \
 \
set query_command='lbdbq %{s}'"
LICENSE = "GPL-2.0-or-later"

PV = "0.49.1"

RPM_NAME = "lbdb-0.49.1-1.7.aarch64.rpm"
RPM_HASH = "6d1dd913f34776ed2271419393b0d6079ec9df07b8a17959a4ed36305b04ef3682c6e37565e1ecf1a8141a0a949601ba276fd4c47fb5ed977a6eb7b2f05be4ab"

RPROVIDES:${PN} += "config(lbdb) lbdb lbdb(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/awk /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
