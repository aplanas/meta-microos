SUMMARY = "ZSH completion for rainbow"
DESCRIPTION = "Zsh command line completion support for rainbow."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "rainbow-zsh-completion-2.8.0-1.4.noarch.rpm"
RPM_HASH = "10a4582097605e4d1e6cdca6b4b0de1fd27257cc0d6b5c6c6900107d96137fcc3af2234436b333459e6eb9edb1cd1a5e8887d423f5b83965cd5950f44c9704cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(rainbow-zsh-completion) \
rainbow-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
