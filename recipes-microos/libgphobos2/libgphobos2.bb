SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "11.3.1+git2076"

RPM_NAME = "libgphobos2-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "67811042d91f36a7b9d9d18c9bfce7382eafd0beb7e2e65d08d57133a7bf11736a7a71e07a293d392a50298a02e6fdc7581d879c55765b6bdac9d46051dd358f"

RPROVIDES:${PN} += "libgphobos.so.2()(64bit) libgphobos2 libgphobos2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
