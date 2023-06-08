SUMMARY = "Zsh Completion for kustomize"
DESCRIPTION = "Zsh command line completion support for kustomize."
LICENSE = "Apache-2.0"

PV = "4.5.7"

RPM_NAME = "kustomize-zsh-completion-4.5.7-1.3.noarch.rpm"
RPM_HASH = "748c646fe07d9ce9b236103b124451245d8a06614ea159c87c7c9ca6a7dd2b922d1a146a6cd3c1a63e4b42cb81e30932c343f5dc8cde7e71c73c1f2e63b9c13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kustomize-zsh-completion"
RDEPENDS:${PN} += "kustomize"

inherit rpm
