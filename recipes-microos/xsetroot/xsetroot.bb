SUMMARY = "Utility to set X root window parameter"
DESCRIPTION = "The xsetroot program allows you to tailor the appearance of the \
background ('root') window on a workstation display running X."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "xsetroot-1.1.3-1.2.aarch64.rpm"
RPM_HASH = "e6226c6a396aa17b660ed87609740bc84310e962b52c9d8aa4b5fc83b72d494f109f5b0dd9b86e15e33ee44dd461390435df4741d77f226b3abde4586b650bcd"

RPROVIDES:${PN} += "xsetroot xsetroot(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXcursor.so.1()(64bit) libXmuu.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
