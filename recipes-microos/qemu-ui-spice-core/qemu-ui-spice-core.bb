SUMMARY = "Core Spice support for QEMU"
DESCRIPTION = "This package contains a module with core Spice support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ui-spice-core-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "a8682a81ff0b0c806ba4a0a314d58bcd9f83c20b70e506e329f37974294c8e0e25e6cb363fa73d901d2c1cdb9799af13de95cbaab346cb07e195eca5a638129c"

RPROVIDES:${PN} += "qemu-ui-spice-core \
qemu-ui-spice-core(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpixman-1.so.0()(64bit) \
libspice-server.so.1()(64bit) \
libspice-server.so.1(SPICE_SERVER_0.10.1)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.10.2)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.10.3)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.10.4)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.11.2)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.12.4)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.13.1)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.14.2)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.6.0)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.8.1)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.8.2)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.8.3)(64bit) \
qemu-audio-spice \
qemu-ui-opengl"

inherit rpm
