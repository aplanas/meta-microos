SUMMARY = "Zsh Completion for helm"
DESCRIPTION = "Zsh command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "helm-zsh-completion-3.12.0-1.1.noarch.rpm"
RPM_HASH = "fd50cbfdd61ebca25cf300314ca447fa6b19579340f1d239fb9fcdc4d1a281e2788660cd19b540393f2b047f437a3616e31898630a161dbb6ebf41b5ed5cea9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-zsh-completion"
RDEPENDS:${PN} += "helm"

inherit rpm
