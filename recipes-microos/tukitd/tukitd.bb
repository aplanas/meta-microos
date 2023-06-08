SUMMARY = "D-Bus controlling service for transactional updates"
DESCRIPTION = "This package provedes the D-Bus service to access libtukit4's \
functionality to manage transactional systems."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.5"

RPM_NAME = "tukitd-4.1.5-1.1.aarch64.rpm"
RPM_HASH = "96a8e145cbe64de91ed03ea166b5a711cbfbd80239c038a6c92e0d328ac84769a12a528dbb0bee02bf01e5587d8839df112fbee6ad6997fa9a9b53e2d7067df6"

RPROVIDES:${PN} += "tukitd tukitd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh dbus-1 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_222)(64bit) libsystemd.so.0(LIBSYSTEMD_234)(64bit) libsystemd.so.0(LIBSYSTEMD_237)(64bit) libsystemd.so.0(LIBSYSTEMD_243)(64bit) libtukit.so.4()(64bit) libtukit4"

inherit rpm
