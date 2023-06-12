SUMMARY = "x86 MicroVM firmware for QEMU"
DESCRIPTION = "This package provides minimal x86 firmware for booting certain guests under \
QEMU. qboot provides the minimum resources needed to boot PVH and bzImages. \
bios-microvm, created from a minimal seabios configuration, provides slightly \
wider support than qboot, but still focuses on quick boot up."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-microvm-8.0.2-1.1.noarch.rpm"
RPM_HASH = "4a12d6e7cf845e07d78ae21d1e5f61bb380db2787f316aa3d7302b23f7ce19673789fddcb2e0d0812b0312cac6dfdb035a728c5ff75692f8eb3e7bf97206b622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-microvm"
RDEPENDS:${PN} += ""

inherit rpm
