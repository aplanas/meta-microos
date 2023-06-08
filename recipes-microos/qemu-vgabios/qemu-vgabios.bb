SUMMARY = "VGA BIOSes for QEMU"
DESCRIPTION = "VGABIOS provides the video ROM BIOSes for the following variants of VGA \
emulated devices: Std VGA, QXL, Cirrus CLGD 5446 and VMware emulated \
video card. For use with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.0_0_gd239552"

RPM_NAME = "qemu-vgabios-1.16.0_0_gd239552-16.1.noarch.rpm"
RPM_HASH = "7f327ca378235a524bd803cc76d5c7d20697d6507eab422bedeeacfcbc0543d28d90cbf556ce078824a16a4fe54c47a28efa2b448ded07b70c8878b038e3ac1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-vgabios"
RDEPENDS:${PN} += ""

inherit rpm
