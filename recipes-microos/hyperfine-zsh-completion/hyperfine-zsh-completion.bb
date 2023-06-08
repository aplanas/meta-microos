SUMMARY = "ZSH Completion for hyperfine"
DESCRIPTION = "The official zsh completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.16.1"

RPM_NAME = "hyperfine-zsh-completion-1.16.1-1.1.noarch.rpm"
RPM_HASH = "eed6f0facdd2ed83738be0da63832ce94097146381b659c4774cffe57571fc029ee1ba9d946a15274bee62035ddf6050c24e48cc5162274fd33779b2488f5cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
