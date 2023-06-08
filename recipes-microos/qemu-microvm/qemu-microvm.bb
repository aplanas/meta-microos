SUMMARY = "x86 MicroVM firmware for QEMU"
DESCRIPTION = "This package provides minimal x86 firmware for booting certain guests under \
QEMU. qboot provides the minimum resources needed to boot PVH and bzImages. \
bios-microvm, created from a minimal seabios configuration, provides slightly \
wider support than qboot, but still focuses on quick boot up."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-microvm-7.1.0-16.1.noarch.rpm"
RPM_HASH = "c233a5453a810bf4aaf2465d517c53a16a90b1223bae029cde01288e807977fe3e4628f778f6ea14b2583f652bbb1b9d12029535756c3572fe5cc17dc1744682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-microvm"
RDEPENDS:${PN} += ""

inherit rpm
