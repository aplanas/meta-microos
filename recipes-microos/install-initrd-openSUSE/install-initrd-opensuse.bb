SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.86"

RPM_NAME = "install-initrd-openSUSE-17.86-1.29.aarch64.rpm"
RPM_HASH = "c0900cf12cc9eacd76168fa8c9ce16fa471dc500421d8f66d5b066e122bb2b58cee3aaa6699f1518f20d924d5cd8857f8ef4a5737c641c54a7aa0fff1c744f01"

RPROVIDES:${PN} += "install-initrd install-initrd-openSUSE install-initrd-openSUSE(aarch-64)"
RDEPENDS:${PN} += "/bin/ln /bin/sh"

inherit rpm
