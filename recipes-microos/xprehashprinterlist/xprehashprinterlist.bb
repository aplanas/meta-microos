SUMMARY = "Utility to recompute list of available printers"
DESCRIPTION = "xprehashprinterlist causes all Xprint servers to recompute (update) \
their lists of available printers, and update the attributes for the \
printers. The intended usage of this tool is that a system \
administrator can run it after changing the printer topology."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xprehashprinterlist-1.0.1-9.26.aarch64.rpm"
RPM_HASH = "ea37b493a0df19aeffefc192e293e18c9f5523a60279688e996d5122f53799c2d44e330abfd494c719c0e7d86f0e831863382d04d91ebeed0059874817842f0c"

RPROVIDES:${PN} += "xprehashprinterlist xprehashprinterlist(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXp.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
