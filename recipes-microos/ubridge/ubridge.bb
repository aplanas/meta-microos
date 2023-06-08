SUMMARY = "Bridging between UDP tunnels, Ethernet and TAP interfaces"
DESCRIPTION = "uBridge is a simple application to create user-land bridges between \
various technologies. Currently bridging between UDP tunnels, \
Ethernet and TAP interfaces is supported.  Packet capture is also \
supported."
LICENSE = "GPL-3.0-only"

PV = "0.9.18"

RPM_NAME = "ubridge-0.9.18-1.11.aarch64.rpm"
RPM_HASH = "1ad4a4bbba6ee3c5ddf69a9016824844b5596fbb293482e8d6fe0974e97e639b89230944959532fb073d13698b8c26b03ab4488206e40cdeef707be8d54c26a6"

RPROVIDES:${PN} += "ubridge ubridge(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libiniparser.so.1()(64bit) libpcap.so.1()(64bit)"

inherit rpm
