SUMMARY = "Bash Completion for kustomize"
DESCRIPTION = "Bash command line completion support for kustomize."
LICENSE = "Apache-2.0"

PV = "4.5.7"

RPM_NAME = "kustomize-bash-completion-4.5.7-1.3.noarch.rpm"
RPM_HASH = "37a7cfbc94c324c4e731fe8bb96c29df3ce16f6c8b3a7b6e917b8e819bacfb6fa7b966ae356c343d8ae02c9dd6b7cb22e33cc525776e7417bfa1e51da95fe85b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kustomize-bash-completion"
RDEPENDS:${PN} += "kustomize"

inherit rpm
