SUMMARY = "Zsh Completion for istioctl"
DESCRIPTION = "zsh command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.17.2"

RPM_NAME = "istioctl-zsh-completion-1.17.2-2.1.noarch.rpm"
RPM_HASH = "41ce31b3961224bb6af733912420c62aa3db6a13541918c632690022d1f8d2d43f491ed710b23b5eae2c34f2031a277cac867d1c0d4241fcc7d5060bc90840bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-zsh-completion"
RDEPENDS:${PN} += "istioctl"

inherit rpm
