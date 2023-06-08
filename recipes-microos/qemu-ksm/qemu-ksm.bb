SUMMARY = "Kernel Samepage Merging services"
DESCRIPTION = "Kernel Samepage Merging (KSM) is a memory-saving de-duplication feature, that \
merges anonymous (private) pages (not pagecache ones). \
 \
This package provides a service file for starting and stopping KSM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-ksm-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "b5968880690463e1a01922535c3528a2c5cc6912379ed9054a959a0a88eb1fb0a6aa2c00fd0464f1e8cc1ec4939975051712dd46e47ac55d8c11e40eba086baf"

RPROVIDES:${PN} += "qemu-ksm qemu-ksm(aarch-64)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
