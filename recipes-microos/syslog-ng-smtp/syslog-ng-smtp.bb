SUMMARY = "SMTP output support for syslog-ng"
DESCRIPTION = "This package provides the afsmtp module providing support for \
logging into SMTP."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-smtp-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "80e9a453ef9fc118755cbc035c7359a7c19c60ddb5f8437d5c9ed694a79e98b3b6e34619980cdd17a71faf538067f20cafddc9dde00010d2456114e718311279"

RPROVIDES:${PN} += "syslog-ng-smtp syslog-ng-smtp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libesmtp.so.6.2.0()(64bit) libsyslog-ng-4.2.so.0()(64bit) syslog-ng"

inherit rpm
