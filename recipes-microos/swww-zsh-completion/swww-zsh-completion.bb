SUMMARY = "Zsh Completion for swww"
DESCRIPTION = "Zsh command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.7.2"

RPM_NAME = "swww-zsh-completion-0.7.2-1.3.noarch.rpm"
RPM_HASH = "0b1219902cc500b928018096b86478804e874bc3107a18ccd5998369ae60df2b3197e3e53fea9f7b30c31170928c86a0bb87b969fbe2d5f5f8c4290155e8c26b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
