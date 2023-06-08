SUMMARY = "Development files for syslog-ng"
DESCRIPTION = "This package provides files necessary for syslog-ng development."
LICENSE = "GPL-2.0-only"

PV = "4.0.1"

RPM_NAME = "syslog-ng-devel-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "25c66aa709c2f5be6a8c2df75d5d60583bd7c6a72f00f3e10c3c6d136d6a1ef6d9a946e41b2d3fe278752defde1747769b966daa01dd2c7fae2595525a66496b"

RPROVIDES:${PN} += "libevtlog-devel pkgconfig(syslog-ng) syslog-ng-devel syslog-ng-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/pkg-config glib2-devel glibc-devel libcap-devel libopenssl-1_1-devel pcre-devel pkgconfig(glib-2.0) syslog-ng systemd-devel"

inherit rpm
