SUMMARY = "SMTP output support for syslog-ng"
DESCRIPTION = "This package provides the afsmtp module providing support for \
logging into SMTP."
LICENSE = "GPL-2.0-only"

PV = "4.0.1"

RPM_NAME = "syslog-ng-smtp-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "4b5ff4b3c2f2bb1aff9812dea730fae6cd9402d8b4c42db2fb4afe6a70ee5bc1612b85024a6ead54dffd15c8fe135b16454abbada0627759c3e8c667a1f6e3e8"

RPROVIDES:${PN} += "libafsmtp.so()(64bit) syslog-ng-smtp syslog-ng-smtp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libesmtp.so.6.2.0()(64bit) libsyslog-ng-4.0.so.0()(64bit) syslog-ng"

inherit rpm
