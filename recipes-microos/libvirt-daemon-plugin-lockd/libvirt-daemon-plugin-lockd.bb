SUMMARY = "lockd client plugin for virtlockd"
DESCRIPTION = "A client-side plugin that implements disk locking using POSIX fcntl advisory \
locks via communication with the virtlockd daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-plugin-lockd-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "4482ebb2d97a0b0f13f3558847c2bd8d1a200c0973f642caf73faac3e333e5fac0af47b2a9894abcfd6fe7af521d3b4c80d82214ea7ef4c8ff8edbb7079c9c5f"

RPROVIDES:${PN} += "libvirt-daemon-plugin-lockd libvirt-daemon-plugin-lockd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.0)(64bit) libvirt-libs libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_0.1.0)(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.3.0)(64bit)"

inherit rpm
