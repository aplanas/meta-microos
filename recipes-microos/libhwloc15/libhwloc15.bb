SUMMARY = "Runtime libraries for hwloc"
DESCRIPTION = "This package contains the run time libraries for hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "libhwloc15-2.9.0-2.3.aarch64.rpm"
RPM_HASH = "bb349e29aa8c89b8a79575762b15e9aaf0fdf4b349bf76e33b9bd7921a1bf2c12cb0e8934dff756946e741c5aae74917b17d4105f584a26d944761d06413f7b1"

RPROVIDES:${PN} += "libhwloc.so.15()(64bit) libhwloc15 libhwloc15(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig hwloc-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpciaccess.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
