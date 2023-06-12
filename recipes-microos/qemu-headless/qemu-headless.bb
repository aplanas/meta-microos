SUMMARY = "Minimum set of packages for having a functional QEMU"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This meta-package brings in, as dependencies, the minimum set of packages \
currently necessary for having a functional (headless) QEMU/KVM stack."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-headless-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "b93dec8c62ea1b43758856c59859ce40efa8c61c148995829e822142ad41f822eca75617ea466f2aa1b0d92ca06e6cc2e9eaf68eb08b6cdb25d27e41fa863b57"

RPROVIDES:${PN} += "qemu-headless qemu-headless(aarch-64)"
RDEPENDS:${PN} += "qemu qemu-chardev-spice qemu-hw-usb-redirect qemu-tools qemu-ui-spice-core"

inherit rpm
