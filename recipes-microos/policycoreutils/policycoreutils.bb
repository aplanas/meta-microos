SUMMARY = "SELinux policy core utilities"
DESCRIPTION = "policycoreutils contains the policy core utilities that are required \
for basic operation of a SELinux system.  These utilities include \
load_policy to load policies, setfiles to label filesystems, newrole \
to switch roles, and run_init to run /etc/init.d scripts in the proper \
context. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-3.5-1.4.aarch64.rpm"
RPM_HASH = "2d8cb9da51a1ad11c6d91210990ffedeee26bd0d07e8b1a6a8cc290f5081df57d8d72310ee35ab525139a9af721709282bb8812ece201e59b24a29832931fa38"

RPROVIDES:${PN} += "config(policycoreutils) policycoreutils policycoreutils(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh gawk ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaudit.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam_misc.so.0()(64bit) libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libselinux.so.1(LIBSELINUX_3.4)(64bit) libsemanage.so.2()(64bit) libsemanage.so.2(LIBSEMANAGE_1.0)(64bit) libsemanage.so.2(LIBSEMANAGE_1.1)(64bit) libsemanage.so.2(LIBSEMANAGE_3.4)(64bit) libsepol.so.2()(64bit) libsepol.so.2(LIBSEPOL_1.0)(64bit) libsepol.so.2(LIBSEPOL_1.1)(64bit) libsepol2 rpm selinux-tools util-linux"

inherit rpm
