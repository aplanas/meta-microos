SUMMARY = "Bash Completion for hut"
DESCRIPTION = "The official bash completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-bash-completion-0.3.0-1.1.noarch.rpm"
RPM_HASH = "87a512f21973b9508b964f481b75ed47370b93e010129e08c548c66f70a7422157b057624a2a1e31b632e03c5526b0ce1e6822e2ef8404fde4ff86433da35ac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
