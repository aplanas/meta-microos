SUMMARY = "List, edit, and run/execute registers/clipboards"
DESCRIPTION = "List, edit, and run or execute registers and/or clipboards"
LICENSE = "GPL-1.0-or-later"

PV = "0.2"

RPM_NAME = "vim-plugin-tregisters-0.2-55.1.noarch.rpm"
RPM_HASH = "7526c3cec15dfb174276f25f8932595d2c743055fc88eb26522c2153dcf5e35eb18331d34d44f8f14b1161fb5ac3ae7b7b192156eba699d684d4bca6f8e63b19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tregisters"
RDEPENDS:${PN} += "vim vim-plugin-tlib"

inherit rpm
