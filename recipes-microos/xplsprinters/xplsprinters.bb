SUMMARY = "Utility to list Xprint printers"
DESCRIPTION = "xplsprinters is a utility for Xprint, the printing system for the \
X Window system. It can deliver both a list of printers and \
attributes supported for a specific list of printers."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xplsprinters-1.0.1-9.26.aarch64.rpm"
RPM_HASH = "7565738c02a645b468cd2181abb60e364a3b6050794486a0612a779c0d81017824eb1620b1f08172a6164b699b259b47328ecac572cd667561f5095a41975c1d"

RPROVIDES:${PN} += "xplsprinters \
xplsprinters(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXp.so.6()(64bit) \
libXprintUtil.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
