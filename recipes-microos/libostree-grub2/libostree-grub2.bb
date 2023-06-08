SUMMARY = "GRUB2 integration for OSTree"
DESCRIPTION = "GRUB2 integration for OSTree"
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-grub2-2023.2-1.1.aarch64.rpm"
RPM_HASH = "11d02a320f2bff1f7fb1e80348d315c6c66e90457f4f66cc95a3457de4ab89d308819ca66ff0a8e3f1f88b1beb8648b75eb5016503feceaf975c1352837438f9"

RPROVIDES:${PN} += "libostree-grub2 libostree-grub2(aarch-64) ostree-grub2"
RDEPENDS:${PN} += "/bin/sh grub2-efi"

inherit rpm
