SUMMARY = "Bash tab-completion scripts for guestfs-tools"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for the virt-* tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "guestfs-tools-bash-completion-1.50.1-1.1.noarch.rpm"
RPM_HASH = "23da2aa977399c33ff4e2e88a43d510f2bb744294e50af616d5779114375c9f70ef7495b8a3edd39afee6a08b80314dce10a9ebb4f1f5a6476e400c81d04cf8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guestfs-tools-bash-completion"
RDEPENDS:${PN} += "bash-completion \
guestfs-tools"

inherit rpm
