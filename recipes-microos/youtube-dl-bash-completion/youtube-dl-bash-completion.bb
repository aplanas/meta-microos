SUMMARY = "Bash completion for youtube-dl"
DESCRIPTION = "Bash command line completion support for youtube-dl."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-bash-completion-2021.12.17-6.1.noarch.rpm"
RPM_HASH = "658291ca157f8f937c66d7223ecc97a4a836174e49dbde710f6384a04357d99a33e614cb3c934b5923aabfa2e4a82cb90310647ced024cee075e97bbd0fc7a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
