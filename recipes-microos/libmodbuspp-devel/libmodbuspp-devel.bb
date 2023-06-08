SUMMARY = "Development files for the libmodbuspp library"
DESCRIPTION = "A C++ wrapper for the libmodbus library, to send/receive data \
with a device which respects the Modbus protocol. This library \
can use a serial port or an Ethernet connection. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmodbuspp."
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "libmodbuspp-devel-0.2.3-1.10.aarch64.rpm"
RPM_HASH = "ffcb9488f302301dafbea61a56de0a3cb225e13a61ab1918859595c87120b4e3dbea805548c7e1d84490ee1e4a17ced3a5bd76f32c5944879af9361129e0103a"

RPROVIDES:${PN} += "libmodbuspp-devel libmodbuspp-devel(aarch-64) pkgconfig(libmodbuspp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmodbuspp1_0-0"

inherit rpm
