SUMMARY = "Development files for libsolv, a package solver"
DESCRIPTION = "Development files for libsolv, a library for solving packages and \
reading repositories."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "libsolv-devel-0.7.24-1.1.aarch64.rpm"
RPM_HASH = "3c610a3111d510eb8cf8b15f9962a82ab4dbf6648b944533686eddc0310a6f1a605578aec60b6c64176813ad7091450342885d6cdc9b6791deb70b3491146dfb"

RPROVIDES:${PN} += "libsolv-devel libsolv-devel(aarch-64) pkgconfig(libsolv) pkgconfig(libsolvext)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) pkgconfig(libsolv) rpm-devel"

inherit rpm
