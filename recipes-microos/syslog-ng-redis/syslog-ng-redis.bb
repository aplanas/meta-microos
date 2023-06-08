SUMMARY = "Redis destination support for syslog-ng"
DESCRIPTION = "This package provides the libredis module providing support for \
logging to a redis destination."
LICENSE = "GPL-2.0-only"

PV = "4.0.1"

RPM_NAME = "syslog-ng-redis-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "e3a7fba61d15246ff659472168c0a6d9392695cc904948b842188fcb6fe7e697977fe9e348a1a316fc3ce0c013459d7b80ec04ef4b9e249b0c227fa1870a3d37"

RPROVIDES:${PN} += "libredis.so()(64bit) syslog-ng-redis syslog-ng-redis(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libhiredis.so.1.1.0()(64bit) libsyslog-ng-4.0.so.0()(64bit) syslog-ng"

inherit rpm
