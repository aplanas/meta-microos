SUMMARY = "Bash Completion for zellij"
DESCRIPTION = "Bash command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.36.0"

RPM_NAME = "zellij-bash-completion-0.36.0-1.1.noarch.rpm"
RPM_HASH = "22adbd7d03efe91a16881e9f289a40f0de3323b48915d654da7eac12811cbbf01324041eaa82fee3ec6c5552781cd5167ee8024229aa6b555c5dec586c74672c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
