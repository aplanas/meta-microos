SUMMARY = "Perl interface to the UNIX syslog(3) calls"
DESCRIPTION = "This module provides an interface to the system logger syslogd(8) via \
Perl's XSUBs. The implementation attempts to resemble the native libc- \
functions of your system, so that anyone being familiar with syslog.h \
should be able to use this module right away. \
 \
Authors: \
-------- \
    Marcus Harnisch <marcus.harnisch@gmx.net>"
LICENSE = "Artistic-1.0"

PV = "1.1"

RPM_NAME = "perl-Unix-Syslog-1.1-20.37.aarch64.rpm"
RPM_HASH = "f41b6f4351ab978e7b33fc1f1a7cf10b361d7b62bb2ee43639b01ca4e98f68d6b752ef1f6a68fd35503b20fb58eddd402939869123bfdf70f20bf9a0ff628194"

RPROVIDES:${PN} += "perl(Unix::Syslog) \
perl-Unix-Syslog \
perl-Unix-Syslog(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
