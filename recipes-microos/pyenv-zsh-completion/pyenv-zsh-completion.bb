SUMMARY = "Zsh completion for pyenv"
DESCRIPTION = "Zsh command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.17"

RPM_NAME = "pyenv-zsh-completion-2.3.17-1.1.noarch.rpm"
RPM_HASH = "c17aabd82c9f9278ec638f1f2516cd1f80de164d485bbcb1be4f75c72eaa58fecd10d652c37644b28389d09657d4a9156387b5dac0a9cdfba43e8bfeb9d53080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(pyenv-zsh-completion) pyenv-zsh-completion"
RDEPENDS:${PN} += "pyenv"

inherit rpm
