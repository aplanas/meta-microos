SUMMARY = "X utility to display system load average"
DESCRIPTION = "xload displays a periodically updating histogram of the system load \
average."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "xload-1.1.4-1.6.aarch64.rpm"
RPM_HASH = "75716817bc70f32720b02ca65ca77112966475e4df3d246e2efa8af00be3b300e51e16fcc4aac527e953d43cefb23705be2c98578e1436aed691382028efae1a"

RPROVIDES:${PN} += "application() \
application(xload.desktop) \
xload \
xload(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
