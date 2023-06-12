SUMMARY = "Bash completion for youtube-dl"
DESCRIPTION = "Bash command line completion support for youtube-dl."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-bash-completion-2021.12.17-7.1.noarch.rpm"
RPM_HASH = "90efcec8f44cd3859af43af9371500aa9df9a2f21c1400908984c32276b91a50c9c6d48d8c9afbe1ace5c6bde181646328feab2e70344f4a0a4188fe7b339ef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
