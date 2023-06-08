SUMMARY = "Zsh Completion for yt-dlp"
DESCRIPTION = "ZSH command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.03.04"

RPM_NAME = "yt-dlp-zsh-completion-2023.03.04-1.1.noarch.rpm"
RPM_HASH = "77827524aabe1b03274baccc8815621484012002b0f755c2bb1e6788a39b7a050d4c03635e03ef5d1a50a602e116031b590d1d7ce270321877581e170adb3e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
