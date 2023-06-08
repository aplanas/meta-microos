SUMMARY = "A Security Tool that Provides Authentication for Applications"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.2.90"

RPM_NAME = "pam-1.5.2.90-1.1.aarch64.rpm"
RPM_HASH = "e98bfc9836f2f5ce6ce07e8c1ab09ed9821f50ba0c08d412751857294911caea538e5c955cfb05002939cd5e43832169ab5cf57273570dbd4adab0bbaf04297e"

RPROVIDES:${PN} += "/sbin/unix2_chkpwd libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_1.4)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.1)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.1.1)(64bit) libpam.so.0(LIBPAM_MODUTIL_1.0)(64bit) libpam.so.0(LIBPAM_MODUTIL_1.1)(64bit) libpam.so.0(LIBPAM_MODUTIL_1.1.3)(64bit) libpam.so.0(LIBPAM_MODUTIL_1.1.9)(64bit) libpam.so.0(LIBPAM_MODUTIL_1.3.2)(64bit) libpam.so.0(LIBPAM_MODUTIL_1.4.1)(64bit) libpam_misc.so.0()(64bit) libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) libpamc.so.0()(64bit) libpamc.so.0(LIBPAMC_1.0)(64bit) pam pam(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig group(shadow) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaudit.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypt.so.1(XCRYPT_4.3)(64bit) libeconf.so.0()(64bit) libeconf.so.0(LIBECONF_0.2)(64bit) libeconf.so.0(LIBECONF_0.4)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) permissions user(root)"

inherit rpm
