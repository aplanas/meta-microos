SUMMARY = "Bash completions for yadm"
DESCRIPTION = "The official bash completion script for yadm."
LICENSE = "GPL-3.0-only"

PV = "3.2.1"

RPM_NAME = "yadm-bash-completion-3.2.1-1.5.noarch.rpm"
RPM_HASH = "c676833a80eca084888b99eb762b97ecf54e132c637bc5e90a0c13f852ca7b9a02c917707f78847c2eb1a44052a4be7df2d699eede398427c838ef1aefa4971d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
