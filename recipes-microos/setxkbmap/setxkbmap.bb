SUMMARY = "Utility to change the keyboard layout in X"
DESCRIPTION = "setxkbmap is an X11 client to change the keymaps in the X server for a \
specified keyboard to use the layout determined by the options listed \
on the command line."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "setxkbmap-1.3.3-1.6.aarch64.rpm"
RPM_HASH = "0e1cfd4cc0c0c1d40be18e5f547db190cbcfbaa0ad33b5ce51528a34ea9b0375b99019ad57675409fbef6fead1a67fdb8abe897c7e966693b4fabc3e98b18378"

RPROVIDES:${PN} += "setxkbmap setxkbmap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libxkbfile.so.1()(64bit)"

inherit rpm
