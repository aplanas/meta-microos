SUMMARY = "Yubico Pluggable Authentication Module (PAM)"
DESCRIPTION = " \
The Yubico PAM module provides an easy way to integrate the YubiKey into your \
existing user authentication infrastructure. PAM is used by GNU/Linux, Solaris \
and Mac OS X for user authentication, and by other specialized applications \
such as NCSA MyProxy."
LICENSE = "BSD-2-Clause"

PV = "2.27"

RPM_NAME = "pam_yubico-2.27-2.10.aarch64.rpm"
RPM_HASH = "297180544a618b6bc507a41347bc507769d4d86011dae135a23d003c031c994e710dd4c35c9e847c0a7070a38a16379b869bc411d78ae7dc416ce529c41bdea9"

RPROVIDES:${PN} += "pam_yubico pam_yubico(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_MODUTIL_1.1.3)(64bit) libykclient.so.3()(64bit) libykclient.so.3(Base)(64bit) libykclient.so.3(YKCLIENT_2.12)(64bit) libykclient.so.3(YKCLIENT_2.15)(64bit) libykpers-1.so.1()(64bit) libykpers-1.so.1(LIBYKPERS_1.0)(64bit) libykpers-1.so.1(LIBYKPERS_1.11)(64bit) libykpers-1.so.1(LIBYKPERS_1.5)(64bit) libykpers-1.so.1(LIBYKPERS_1.8)(64bit) libykpers-1.so.1(LIBYKPERS_1.9)(64bit) libyubikey.so.0()(64bit) libyubikey.so.0(YUBIKEY_1.0)(64bit) libyubikey.so.0(YUBIKEY_1.5)(64bit)"

inherit rpm
