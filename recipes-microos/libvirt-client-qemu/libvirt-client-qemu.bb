SUMMARY = "Additional client side utilities for QEMU"
DESCRIPTION = "The additional client binaries are used to interact \
with some QEMU specific features of libvirt."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-client-qemu-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "c2c06a9054c525732e5dc5d882c35ec7d6dd7476f92bef87687a49c3c133ee1eb2aeab56ce377baba29cdcb9aaa758a4741d584abe6da45c0d56a0b16324794e"

RPROVIDES:${PN} += "libvirt-client-qemu libvirt-client-qemu(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env libvirt-libs python3-libvirt-python"

inherit rpm
