SUMMARY = "HTTP destination support for syslog-ng"
DESCRIPTION = "This package provides HTTP destination support for syslog-ng by means \
of libcurl."
LICENSE = "GPL-2.0-only"

PV = "4.0.1"

RPM_NAME = "syslog-ng-curl-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "a2906b194450910f7a0dce3fdb6571ed5042715491d01e546cfbf4367fab0cd1143b3691290a15b7c0e65c5c101efa29ae9b5818477a11424d37c0e9e44e8463"

RPROVIDES:${PN} += "libhttp.so()(64bit) syslog-ng-curl syslog-ng-curl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcurl.so.4()(64bit) libsyslog-ng-4.0.so.0()(64bit) syslog-ng"

inherit rpm
