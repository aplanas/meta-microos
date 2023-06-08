SUMMARY = "Low-Level Event Loop Management Library"
DESCRIPTION = "Liboop is a low-level event loop management library for POSIX-based \
operating systems. It supports the development of modular, multiplexed \
applications that may respond to events from several sources. It \
replaces the 'select() loop' and allows the registration of event \
handlers for file and network I/O, timers, and signals. Because \
processes use these mechanisms for almost all external communication, \
liboop can be used as the basis for almost any application."
LICENSE = "LGPL-2.1+"

PV = "1.0.1"

RPM_NAME = "liboop4-1.0.1-2.19.aarch64.rpm"
RPM_HASH = "4b62c029d5a96209fbbb040e97af4b40befbdd6679a2c0e64c858e37bee549bd0ac90917271e5b58739fc240d70b54b5a0b021cdd9c08a0890f3eb41458f33c1"

RPROVIDES:${PN} += "liboop.so.4()(64bit) liboop4 liboop4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
