SUMMARY = "PAM module to provide unprivileged cgroupfs"
DESCRIPTION = "When a user logs in, this PAM module will create cgroups which the user may \
administer, either for all controllers or for any controllers listed on the \
command line."
LICENSE = "LGPL-2.1-only"

PV = "5.0.1"

RPM_NAME = "pam_cgfs-5.0.1-2.3.aarch64.rpm"
RPM_HASH = "899b63c6d0aa24c1b818a8182cb00cd7c46b8d7391892aa020ce6b20e6bc8db5b872a4a8e1a927c7bb494b244c8e732451ccf47827906d35ed0e9bd4fbba62ea"

RPROVIDES:${PN} += "pam_cgfs pam_cgfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit)"

inherit rpm
