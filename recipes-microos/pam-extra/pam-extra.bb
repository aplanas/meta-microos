SUMMARY = "PAM module with extended dependencies"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains extra modules eg pam_issue and pam_timestamp which \
can have extended dependencies."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.2.90"

RPM_NAME = "pam-extra-1.5.2.90-1.1.aarch64.rpm"
RPM_HASH = "d521bbb551cd8805114d87d220c456072d213e9e89bf2914b483100469d1e4403ee35e27250411579ce951402db664ba949c9e812bed762f1520a0b1ca48ace6"

RPROVIDES:${PN} += "pam-extra pam-extra(aarch-64) pam:/usr/sbin/pam_timestamp_check"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) libpam.so.0(LIBPAM_MODUTIL_1.0)(64bit)"

inherit rpm
