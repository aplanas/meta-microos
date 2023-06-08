SUMMARY = "Bash Completion for rclone"
DESCRIPTION = "Bash command line completion support for rclone."
LICENSE = "MIT"

PV = "1.62.2"

RPM_NAME = "rclone-bash-completion-1.62.2-2.1.noarch.rpm"
RPM_HASH = "76abc134b0c88732e90bab2aa4135ced22278ab08c7f278bbdc36367cf444d5bb19cb7a2765f8c1dfe0452d6f81735e0652f95232c2a6969e70d15b43ee1d1a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-bash-completion"
RDEPENDS:${PN} += "rclone"

inherit rpm
