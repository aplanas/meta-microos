SUMMARY = "ZSH completion for jo"
DESCRIPTION = "zsh shell completions for jo."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.9"

RPM_NAME = "jo-zsh-completion-1.9-1.2.noarch.rpm"
RPM_HASH = "1345d9e1492d75d949182df01f3cb10ce3b4ba1b2658d70b2e24bffc1e686ddad15e6b42f2cc6a2f7964c07b0eee49a40cd7d48be0b3bb2302917158903c7836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(jo-zsh-completion) \
jo-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
