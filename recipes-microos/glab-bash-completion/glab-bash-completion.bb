SUMMARY = "Bash completion for glab"
DESCRIPTION = "Bash command line completion support for glab."
LICENSE = "MIT"

PV = "1.29.1"

RPM_NAME = "glab-bash-completion-1.29.1-1.1.noarch.rpm"
RPM_HASH = "4976f4f36a7b5af10b3a0c599a48586c928de97b98fc10acaa2897b61e1f8a04b6246fe061e8398794b876d16561ce28b9c4cf9e372a5ff2d048ce33d45e4022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-bash-completion"
RDEPENDS:${PN} += "glab"

inherit rpm
