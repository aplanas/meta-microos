SUMMARY = "An X11 bar"
DESCRIPTION = "lemonbar is a bar entirely based on XCB. It provides full UTF-8 \
support, basic formatting, RandR and Xinerama support and EWMH \
compliance."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "lemonbar-1.4-1.8.aarch64.rpm"
RPM_HASH = "2e302f101b819b883493dc7b291c3d78adfa0e33cd33ee43f72727b04bd64525a583e6593904c18b9b85a2cfb40acc580fff7ab13a037cf07ea6e1165006138d"

RPROVIDES:${PN} += "lemonbar lemonbar(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libxcb-randr.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
