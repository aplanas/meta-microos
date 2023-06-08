SUMMARY = "Core Spice support for QEMU"
DESCRIPTION = "This package contains a module with core Spice support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-ui-spice-core-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "47c0f8d720e39182d6917af718a0474d02100f0cb6ddf065400fa2aceb3acd5216ccdc749290001405da20cae6f5cfa2e9f81fcdc56475c4501c2c3f98651be2"

RPROVIDES:${PN} += "qemu-ui-spice-core qemu-ui-spice-core(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpixman-1.so.0()(64bit) libspice-server.so.1()(64bit) libspice-server.so.1(SPICE_SERVER_0.10.1)(64bit) libspice-server.so.1(SPICE_SERVER_0.10.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.10.3)(64bit) libspice-server.so.1(SPICE_SERVER_0.10.4)(64bit) libspice-server.so.1(SPICE_SERVER_0.11.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.12.4)(64bit) libspice-server.so.1(SPICE_SERVER_0.13.1)(64bit) libspice-server.so.1(SPICE_SERVER_0.14.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.6.0)(64bit) libspice-server.so.1(SPICE_SERVER_0.8.1)(64bit) libspice-server.so.1(SPICE_SERVER_0.8.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.8.3)(64bit) qemu-audio-spice qemu-ui-opengl"

inherit rpm
