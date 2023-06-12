SUMMARY = "VGA BIOSes for QEMU"
DESCRIPTION = "VGABIOS provides the video ROM BIOSes for the following variants of VGA \
emulated devices: Std VGA, QXL, Cirrus CLGD 5446 and VMware emulated \
video card. For use with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.2_3_gd478f380"

RPM_NAME = "qemu-vgabios-1.16.2_3_gd478f380-1.1.noarch.rpm"
RPM_HASH = "f00cfc3e734777c4301d88ee1fbffac427698393d8ad2c59d5ef768e5c6f464d520744e8560e9a1c2cafc0ba79d82827c4d13a13dffa803793de1cde1229a950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-vgabios"
RDEPENDS:${PN} += ""

inherit rpm
