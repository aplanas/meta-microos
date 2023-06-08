SUMMARY = "Library that provides access to DVB adapter cards"
DESCRIPTION = "libdvbv5 is a library meant to be used by digital TV applications that need to \
talk with media hardware. \
 \
This package contains shared lib for packages that use libdvbv5."
LICENSE = "GPL-2.0-only"

PV = "1.24.1"

RPM_NAME = "libdvbv5-0-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "85fbdfc322b99a1fb72dddf0a04958fc1b0e8e3a4b318e312986de777276f549a37d5a4d153fc50fdd51eb59f7414e83cfbf3231b065331c548d20b73f5841df"

RPROVIDES:${PN} += "libdvbv5-0 libdvbv5-0(aarch-64) libdvbv5.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
