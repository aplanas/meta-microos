SUMMARY = "x86 Legacy BIOS for QEMU"
DESCRIPTION = "SeaBIOS is an open source implementation of a 16bit x86 BIOS. SeaBIOS \
is the default and legacy BIOS for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.16.0_0_gd239552"

RPM_NAME = "qemu-seabios-1.16.0_0_gd239552-16.1.noarch.rpm"
RPM_HASH = "2dbe7ee771f2a78ebc2fa233a5391230e983e938270584f239310d9be26e8a845626654943830ad62a5f4c2ffd1450d92d013758c3bca4ff1cebbbe646b48dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-seabios"
RDEPENDS:${PN} += ""

inherit rpm
