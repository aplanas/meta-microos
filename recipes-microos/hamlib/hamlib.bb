SUMMARY = "Run-time library to control radio transcievers and receivers"
DESCRIPTION = "The Ham Radio Control Libraries (Hamlib) provide a programming \
interface for controlling radios and other shack hardware. \
It is a software layer, not a complete user application."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "hamlib-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "774b6218efcae0104327a320e58830e7061dbe29edb0ca718e5848d01ff41576aa1f35e856a23a7a061199c4f34c184d12cfab8e814e0058787f25bebb9370e4"

RPROVIDES:${PN} += "hamlib hamlib(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libhamlib.so.4()(64bit) libreadline.so.8()(64bit) libusb-1.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
