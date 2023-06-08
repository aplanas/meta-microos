SUMMARY = "PAM module for AppArmor change_hat"
DESCRIPTION = "The pam_apparmor module provides the means for any PAM applications \
that call pam_open_session() to automatically perform an AppArmor \
change_hat operation in order to switch to a user-specific security \
policy."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.3"

RPM_NAME = "pam_apparmor-3.1.3-2.1.aarch64.rpm"
RPM_HASH = "8e84a62c7ff88cd2605f3c0f2f99adb2ac9d72e0d8a2ba2019d11cb7c3048bc912a5f090c1dda8336b6a38b54a17e81409f990d2d19e159e2e86353dde07c249"

RPROVIDES:${PN} += "pam_apparmor pam_apparmor(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libapparmor.so.1()(64bit) libapparmor.so.1(APPARMOR_1.1)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) libpam.so.0(LIBPAM_MODUTIL_1.0)(64bit) pam pam-config"

inherit rpm
