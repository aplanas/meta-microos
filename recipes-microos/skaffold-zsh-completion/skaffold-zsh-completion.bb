SUMMARY = "Zsh Completion for skaffold"
DESCRIPTION = "zsh command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "skaffold-zsh-completion-2.4.0-1.1.noarch.rpm"
RPM_HASH = "18ff65b023e9df3987a65f158aaa05616dbced2d39c0529098dafeaceb2ba6d080db32a85f9ede1d24546266525f2e93b43a961370104c90d0fc97ec9d804da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-zsh-completion"
RDEPENDS:${PN} += "skaffold"

inherit rpm
