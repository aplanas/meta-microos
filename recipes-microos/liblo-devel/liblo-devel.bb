SUMMARY = "Header files for the liblo OSC implementation"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of liblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.31"

RPM_NAME = "liblo-devel-0.31-1.11.aarch64.rpm"
RPM_HASH = "d05e1da208a3e5c2b2e29e3b900f79f1bc00ae18680aa5a4c0327086f0c7e0dcf05666b65774ae83c3dd6d35fb426e54ca1704ef62a42bdc01b473f1dcbd577e"

RPROVIDES:${PN} += "liblo-devel \
liblo-devel(aarch-64) \
pkgconfig(liblo)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblo.so.7()(64bit) \
liblo7"

inherit rpm
