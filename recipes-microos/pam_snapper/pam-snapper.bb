SUMMARY = "PAM module for calling snapper"
DESCRIPTION = "A PAM module for calling snapper during user login and logout."
LICENSE = "GPL-2.0-only"

PV = "0.10.4"

RPM_NAME = "pam_snapper-0.10.4-13.2.aarch64.rpm"
RPM_HASH = "75c25d8288f2ce49d78cba8aa2c7405ec823bdba4ffbbc4e9ac0872295f87a84ee0b3022892dc7a5fd67ce18afc0c30d3ac3518f14b117ee793cc71a05a148ba"

RPROVIDES:${PN} += "pam_snapper pam_snapper(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) pam snapper"

inherit rpm
