SUMMARY = "PCI utility library"
DESCRIPTION = "libpci offers access to the PCI configuration space."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.0"

RPM_NAME = "libpci3-3.9.0-2.3.aarch64.rpm"
RPM_HASH = "db9315f828d68518fa329a22569063a15bc83a702cc0609856dcf27f12578f4ff573b24bcdf80f0d000da31ffdc4fdc1db819356418f1ccae8dd6297e6cac17d"

RPROVIDES:${PN} += "libpci.so.3()(64bit) libpci.so.3(LIBPCI_3.0)(64bit) libpci.so.3(LIBPCI_3.1)(64bit) libpci.so.3(LIBPCI_3.2)(64bit) libpci.so.3(LIBPCI_3.3)(64bit) libpci.so.3(LIBPCI_3.4)(64bit) libpci.so.3(LIBPCI_3.5)(64bit) libpci.so.3(LIBPCI_3.6)(64bit) libpci.so.3(LIBPCI_3.7)(64bit) libpci.so.3(LIBPCI_3.8)(64bit) libpci3 libpci3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit)"

inherit rpm
