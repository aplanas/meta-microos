SUMMARY = "Machine emulator and virtualizer"
DESCRIPTION = " \
QEMU provides full machine emulation and cross architecture usage. It closely \
integrates with KVM and Xen virtualization, allowing for excellent performance. \
Many options are available for defining the emulated environment, including \
traditional devices, direct host device access, and interfaces specific to \
virtualization. \
 \
This package acts as an umbrella package to the other QEMU sub-packages."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "d4cd46d68e92c4a95f7758741a92ec7bee1bf7a104c22a2b5dd97ca9f9b83d317c6cd18dd7444d32b49b6657c95b1d6c1ea43a6682a11cca173130a153b0fbf1"

RPROVIDES:${PN} += "application() application(qemu.desktop) qemu qemu(aarch-64)"
RDEPENDS:${PN} += "(qemu-guest-agent = 7.1.0 if qemu-guest-agent) /bin/bash /bin/sh acl coreutils group(kvm) group(qemu) qemu-arm udev user(qemu)"

inherit rpm
