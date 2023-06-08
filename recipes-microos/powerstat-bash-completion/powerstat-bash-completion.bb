SUMMARY = "Bash Completion for powerstat"
DESCRIPTION = "Bash completion script for powerstat."
LICENSE = "GPL-2.0-only"

PV = "0.03.02"

RPM_NAME = "powerstat-bash-completion-0.03.02-1.1.noarch.rpm"
RPM_HASH = "ec1b2cf7367eeb12d1cb8305148484eeed34cfdbdef2f65566f83bdb88891b3e0dafbb0e96c6718cb4f348e5aac3cc06d092a921cbb39f6d1000809d8c63ec03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powerstat-bash-completion"
RDEPENDS:${PN} += "bash-completion powerstat"

inherit rpm
