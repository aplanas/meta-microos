SUMMARY = "ZSH completion for git-subrepo"
DESCRIPTION = "zsh shell completions for git-subrepo"
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "git-subrepo-zsh-completion-0.4.6-1.1.noarch.rpm"
RPM_HASH = "27f98d815f25470c356ae400f5ce2bd70771e7ce561364338c40d772f136f00b851012487bd9227061990cb0a8ff30d660716c286d58095442c701c3b6f0fce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-subrepo-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
