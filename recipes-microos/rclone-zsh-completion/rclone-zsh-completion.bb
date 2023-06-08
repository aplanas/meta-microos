SUMMARY = "Zsh Completion for rclone"
DESCRIPTION = "Zsh command line completion support for rclone."
LICENSE = "MIT"

PV = "1.62.2"

RPM_NAME = "rclone-zsh-completion-1.62.2-2.1.noarch.rpm"
RPM_HASH = "ecdcc09332ac03622886e985bc07558a89673ad64b5ace27b6a6d4087b1abe40f7879674c9727995027dc668ece3639c36e93f0df6d53e992db470982a11fd51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-zsh-completion"
RDEPENDS:${PN} += "rclone"

inherit rpm
