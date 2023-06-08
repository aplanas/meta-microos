SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libobjc4-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "2555c604e03e8f26b91ff164fa1acc112f4fcba09b2bcc1e40c3872ecd4545e48c2d26d0104a4955b8281027868d018a8b2a05d1b69e34db2986ab424118cc72"

RPROVIDES:${PN} += "libobjc.so.4()(64bit) libobjc4 libobjc4-gcc7 libobjc4-gcc7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm
