SUMMARY = "The newrole application for RBAC/MLS"
DESCRIPTION = "RBAC/MLS policy machines require newrole as a way of changing the role \
or level of a logged-in user."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-newrole-3.5-1.4.aarch64.rpm"
RPM_HASH = "5d368a3bd980d32a7f73e30d59979f1b33c08b997f03a9c1c740835ce394c14e700b1617542ee3312c97897e2c32d43aed9df8c7870afacf8164b067c6529746"

RPROVIDES:${PN} += "policycoreutils-newrole policycoreutils-newrole(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaudit.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam_misc.so.0()(64bit) libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) permissions policycoreutils"

inherit rpm
