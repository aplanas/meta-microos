SUMMARY = "X11 miscellaneous 'fixes' extension library"
DESCRIPTION = "The X Fixes extension provides applications with work-arounds for \
various limitations in the core protocol."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "libXfixes3-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "450354ff84138c740e306ca05b9376ac4fbe164af583b587888d589fce16ad7539f382aeb14e9ae4d28fc1107dc131f914a3ccb0d163d2283c30894da2ade26d"

RPROVIDES:${PN} += "libXfixes.so.3()(64bit) libXfixes3 libXfixes3(aarch-64) xorg-x11-libXfixes"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
