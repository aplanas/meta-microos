SUMMARY = "Day/night gamma adjustments for Wayland compositors"
DESCRIPTION = "Day/night gamma adjustments for Wayland compositors supporting wlr-gamma-control-unstable-v1"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "wlsunset-0.2.0-1.10.aarch64.rpm"
RPM_HASH = "9da6396ac328ed3cec1aed2156144b04e35cd5b8a111c0c2e17568e1aeef42eea9a528350634e211ff1eec0fcbc85b4f46618fcec64f86849b84840f1991e31f"

RPROVIDES:${PN} += "wlsunset \
wlsunset(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
