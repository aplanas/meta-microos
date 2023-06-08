SUMMARY = "PCI utilities for the Linux Kernel"
DESCRIPTION = "lspci: This program displays detailed information about all PCI busses \
and devices in the system, replacing the original /proc/pci interface. \
 \
setpci: This program allows reading from and writing to PCI device \
configuration registers. For example, you can adjust the latency timers \
with it. \
 \
update-pciids: This program downloads the current version of the \
pci.ids file."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.0"

RPM_NAME = "pciutils-3.9.0-2.3.aarch64.rpm"
RPM_HASH = "d627f29f15c905622563982d5e1e0d9baf5b0551e63bdb6099a6a833ac13eacf3590f94b0b1ac5ec29e09e0ebc44c3dbe71c14f86bc0b139fb48302068a25568"

RPROVIDES:${PN} += "pciutils pciutils(aarch-64)"
RDEPENDS:${PN} += "hwdata ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkmod.so.2()(64bit) libkmod.so.2(LIBKMOD_5)(64bit) libpci.so.3()(64bit) libpci.so.3(LIBPCI_3.0)(64bit) libpci.so.3(LIBPCI_3.1)(64bit) libpci.so.3(LIBPCI_3.5)(64bit) libpci.so.3(LIBPCI_3.6)(64bit) libpci.so.3(LIBPCI_3.7)(64bit) libpci.so.3(LIBPCI_3.8)(64bit)"

inherit rpm
