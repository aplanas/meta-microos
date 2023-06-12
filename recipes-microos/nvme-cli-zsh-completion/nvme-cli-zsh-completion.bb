SUMMARY = "NVM Express user space tools zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for NVM Express user space tools"
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-zsh-completion-2.4-1.1.noarch.rpm"
RPM_HASH = "efb1efd22b7ebce60d2639dd0fe55aed24c75b9b56a13bc7fabe3e6b76e542c25da027c0168bf24e7665453c8ca59f2995737d0558940dd6c7cd555559e331f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-zsh-completion"
RDEPENDS:${PN} += "nvme-cli \
zsh"

inherit rpm
