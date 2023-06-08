SUMMARY = "Syslog-ng event logger library runtime"
DESCRIPTION = "The EventLog library provides an alternative to the simple syslog() \
API provided on UNIX systems. Compared to syslog, EventLog adds \
structured messages. \
 \
EventLog provides an interface to build, format and output an event \
record. The exact format and output method can be customized by the \
administrator via a configuration file. \
 \
This package is now merged into syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.0.1"

RPM_NAME = "libevtlog-4_0-0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "e2022ffeb7f788247bbf7adffacd95b61f5b2c4eac23e615ba7dac27b643ce2711a571909e8b5ed8429dd9779b480fc60d0abc61d91761b8eb8078cc24438ea2"

RPROVIDES:${PN} += "libevtlog-4.0.so.0()(64bit) libevtlog-4_0-0 libevtlog-4_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
