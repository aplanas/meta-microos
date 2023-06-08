SUMMARY = "SELinux policy core policy devel utilities"
DESCRIPTION = "The policycoreutils-devel package contains the management tools use to develop policy in an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-devel-3.5-1.4.aarch64.rpm"
RPM_HASH = "d2fb09c2874259ee3bf500a2a381c42d60f03b549a9c64aa84e993a6bdc7f5b883becca7cfddcde626070d8a82f3a3f48b9888bf0707966a84e67f52e1dd5695"

RPROVIDES:${PN} += "policycoreutils-devel policycoreutils-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/make /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) python3-distro python3-policycoreutils"

inherit rpm
