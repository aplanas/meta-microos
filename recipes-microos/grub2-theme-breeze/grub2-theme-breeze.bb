SUMMARY = "Plasma branding for GRUB2's graphical console"
DESCRIPTION = "Plasma branding for the GRUB2's graphical console."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.4"

RPM_NAME = "grub2-theme-breeze-5.27.4-1.1.noarch.rpm"
RPM_HASH = "5d0ea38d4276f753355480777f6c8309821c8288280c863c088a521fb2b36c914c48e558e154f03c43a108f2af8b24020d0ac79d25e04a0fb1e943ea9fe7b487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-theme-breeze"
RDEPENDS:${PN} += ""

inherit rpm
