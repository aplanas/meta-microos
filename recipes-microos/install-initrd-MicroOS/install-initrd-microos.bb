SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.86"

RPM_NAME = "install-initrd-MicroOS-17.86-1.29.aarch64.rpm"
RPM_HASH = "55e7e9a30cc6f0c0ad08a64683cbede9bdcd92742a30e20d8328d5e7095c771194cdbe4bf4d10fbed10aecd04b1fe0a932a40aa99b8f4b1cbeab2da8fd702403"

RPROVIDES:${PN} += "install-initrd install-initrd-MicroOS install-initrd-MicroOS(aarch-64)"
RDEPENDS:${PN} += "/bin/ln /bin/sh"

inherit rpm
