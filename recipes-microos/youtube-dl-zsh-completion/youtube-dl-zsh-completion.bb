SUMMARY = "Zsh Completion for youtube-dl"
DESCRIPTION = "ZSH command line completion support for youtube-dl."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-zsh-completion-2021.12.17-7.1.noarch.rpm"
RPM_HASH = "c0d50bbe03b68447a9d9248f6c8427959f5f786026c4d42ccb472875ee6430a4fa003c220020d17b85bcabb5fe1c2121f6512dc8bda34d9be7c5aafbbcfe6a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
