SUMMARY = "X server resource database utility"
DESCRIPTION = "Xrdb is used to get or set the contents of the RESOURCE_MANAGER property \
on the root window of screen 0, or the SCREEN_RESOURCES property on the \
root window of any or all screens, or everything combined."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "xrdb-1.2.1-2.7.aarch64.rpm"
RPM_HASH = "ca0bb861ed79d2aa88335b1852a4027ccd8fb2af9c134faf7a62387e34cfd6a9ab50c14dd6dbac1eb99616618c963c5f15e75f77cca7789cd175fb18449e0c5c"

RPROVIDES:${PN} += "xrdb xrdb(aarch-64)"
RDEPENDS:${PN} += "cpp ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXmuu.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
