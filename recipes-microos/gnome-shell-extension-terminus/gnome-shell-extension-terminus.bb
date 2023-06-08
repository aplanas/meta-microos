SUMMARY = "Show Terminus Quake Mode"
DESCRIPTION = "Allows to show the Quake-like terminal from Terminus by pressing the \
defined hotkey."
LICENSE = "GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "gnome-shell-extension-terminus-2.3.1-1.1.noarch.rpm"
RPM_HASH = "170a805c66be108af98a9592b38d44a82b5ca30f09ac6953f70cbfe5b1578a164d0a18da9bd9aa223e3a2b0c2aed6efaa593d50a4057d7c57ec2cc98b3d5d0cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-terminus"
RDEPENDS:${PN} += "gnome-shell terminus"

inherit rpm
