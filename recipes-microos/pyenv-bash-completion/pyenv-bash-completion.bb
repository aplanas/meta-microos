SUMMARY = "Bash completion for pyenv"
DESCRIPTION = "Bash command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.17"

RPM_NAME = "pyenv-bash-completion-2.3.17-1.1.noarch.rpm"
RPM_HASH = "92d5ce7da31a8ea5c04d90fac8dfc63909b05632f347922ade2f007ba542f6790cbbcdfcb046996e3102f0fa8571fed98aa834b300b57c1411d1ddf200fd0f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyenv-bash-completion"
RDEPENDS:${PN} += "pyenv"

inherit rpm
