SUMMARY = "Zsh Completion for youtube-dl"
DESCRIPTION = "ZSH command line completion support for youtube-dl."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-zsh-completion-2021.12.17-6.1.noarch.rpm"
RPM_HASH = "7ec2ad0b99726c3e37f237c17642a3b44de5b522b8c3e21e1ea4d16ad5f04a0fde1b08ce31132bbb3f190ab98736bd53a32af5d8ba09672317dae255e04f9aa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
