SUMMARY = "PAM module to authenticate against a separate database"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains pam_userdb which is used to verify a \
username/password pair against values stored in a Berkeley DB database."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.2.90"

RPM_NAME = "pam-userdb-1.5.2.90-1.1.aarch64.rpm"
RPM_HASH = "a1c669e2ad616d530c1e90cb5099633915ce0e3d39fb2b2c2eef775f4d67820f334770219b284bc92aec566269b7fe84b3687b184d901bd3895a9457f11b75c8"

RPROVIDES:${PN} += "pam-extra:/usr/lib64/security/pam_userdb.so pam-userdb pam-userdb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libdb-4.8.so()(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit)"

inherit rpm
