SUMMARY = "ZSH completion for git-subrepo"
DESCRIPTION = "zsh shell completions for git-subrepo"
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "git-subrepo-zsh-completion-0.4.5-1.2.noarch.rpm"
RPM_HASH = "eac95c4aa678e24632d37f4810f5cd1533a2c7e301bebf77d7853e4ba28651ca14713231bd8db74d049c9090829ee588b9a8c59fda230a545fffd3d18cb97605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-subrepo-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
