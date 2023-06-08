SUMMARY = "GeoIP (MaxMindDB) support for syslog-ng"
DESCRIPTION = "This package provides GeoIP (MaxMindDB) modules providing support for \
logging geo-location information."
LICENSE = "GPL-2.0-only"

PV = "4.0.1"

RPM_NAME = "syslog-ng-geoip-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "7c8f2202c138045715e7b802f75a5d118d069a7a961c5c66c1d6f137967bd798bafe37d62d8bb78059b61c8c0af16af39905a9f19b27f6338eb8a45a57c93e70"

RPROVIDES:${PN} += "libgeoip2-plugin.so()(64bit) syslog-ng-geoip syslog-ng-geoip(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libmaxminddb.so.0()(64bit) libsyslog-ng-4.0.so.0()(64bit) syslog-ng"

inherit rpm
