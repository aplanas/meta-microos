SUMMARY = "User-space driver for Mellanox BlueField SoC"
DESCRIPTION = "This is the user-space driver to access the BlueField SoC via the rshim \
interface. It provides ways to push boot stream, debug the target or login \
via the virtual console or network interface."
LICENSE = "GPL-2.0 | BSD-3-Clause"

PV = "2.0.7.0"

RPM_NAME = "rshim-2.0.7.0-1.1.aarch64.rpm"
RPM_HASH = "89b5e277a3b0dd95ecef15e2daf9ddc318f0d1c80bac8a38a248220761486b5497b79b5e395c59eda18c7aeeecae15ef34bdd460a949d2b839ca9fd746687954"

RPROVIDES:${PN} += "rshim rshim(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.4)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.8)(64bit) libpci.so.3()(64bit) libpci.so.3(LIBPCI_3.0)(64bit) libpci.so.3(LIBPCI_3.5)(64bit) libpci.so.3(LIBPCI_3.8)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
