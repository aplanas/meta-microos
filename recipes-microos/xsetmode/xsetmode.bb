SUMMARY = "Utility to set the mode for an X Input device"
DESCRIPTION = "Xsetmode sets the mode of an XInput device to either absolute or \
relative."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "xsetmode-1.0.0-10.7.aarch64.rpm"
RPM_HASH = "d3eb3220b20bdc90b3534762850cdbece09c49c0821211008d18726eaa337aebe7eead3215ba41987a2ab88c58b933060a1bb7a35b4a58e8596b8e405f3dddf9"

RPROVIDES:${PN} += "xsetmode xsetmode(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXi.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
