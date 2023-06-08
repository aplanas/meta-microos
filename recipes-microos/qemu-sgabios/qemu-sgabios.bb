SUMMARY = "Serial Graphics Adapter BIOS for QEMU"
DESCRIPTION = "The Google Serial Graphics Adapter BIOS or SGABIOS provides a means for legacy \
x86 software to communicate with an attached serial console as if a video card \
were attached. For use with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8"

RPM_NAME = "qemu-sgabios-8-16.1.noarch.rpm"
RPM_HASH = "1bf4c5bd4cc2266bcef5a35dac01873628fa29b9ea71950f15b20948a023455c5b730b4dbbe58776c624637c9facfe03e38958d68727fa36928412669457dd9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-sgabios"
RDEPENDS:${PN} += ""

inherit rpm
