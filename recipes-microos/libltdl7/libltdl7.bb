SUMMARY = "Libtool Runtime Library"
DESCRIPTION = "Library needed by programs that use the ltdl interface of GNU libtool."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.7"

RPM_NAME = "libltdl7-2.4.7-3.3.aarch64.rpm"
RPM_HASH = "714c07e6bbe0bb6c289850b1dc7fe57268950b18e8428a20dd266b7488329e9c16f88786c89698d667fdd366e35e1cdb9221890137354860e8e15f4be505d7ff"

RPROVIDES:${PN} += "libltdl.so.7()(64bit) libltdl7 libltdl7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
