SUMMARY = "SELinux binary policy manipulation library"
DESCRIPTION = "libsepol provides an API for the manipulation of SELinux binary \
policies. It is used by checkpolicy (the policy compiler) and similar \
tools, as well as by programs like load_policy that need to perform \
specific transformations on binary policies such as customizing \
policy boolean settings. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsepol2-3.5-1.3.aarch64.rpm"
RPM_HASH = "271c292c57826187bfc71ebd8863a3092e8a352e06e5d359fe23b450e9f10243eb7c1744bbe22ed9608f54cda1717c755a5d8649f159ce92ca63e54b9d9dae77"

RPROVIDES:${PN} += "libsepol.so.2()(64bit) libsepol.so.2(LIBSEPOL_1.0)(64bit) libsepol.so.2(LIBSEPOL_1.1)(64bit) libsepol.so.2(LIBSEPOL_3.0)(64bit) libsepol.so.2(LIBSEPOL_3.4)(64bit) libsepol2 libsepol2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
