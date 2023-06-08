SUMMARY = "C interface of the Ham Radio Control Libraries"
DESCRIPTION = "Hamlib provides a programming interface for controlling radios and \
other shack hardware. It is a software layer, not a complete user \
application."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "libhamlib4-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "57bfffeda49e2bffefe4297a7e1eaa564c32b994b48b649aea29aca45c31b7101df0e981f90932e3d9d5f5ffabdf3e69304173dd18edafa9677a1584a4ee9b21"

RPROVIDES:${PN} += "libhamlib.so.4()(64bit) libhamlib4 libhamlib4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
