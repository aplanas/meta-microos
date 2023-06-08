SUMMARY = "Bash Completion for kompose"
DESCRIPTION = "The official bash completion script for kompose, generated during the build."
LICENSE = "Apache-2.0"

PV = "1.26.1"

RPM_NAME = "kompose-bash-completion-1.26.1-1.8.noarch.rpm"
RPM_HASH = "d09016db36e2cc01e98b765fce807cee778df73e7e76ab8de8d0166615098fb576d6d43a0ad56a78eaf66f3cf731e814a5cd8fc0030440369d58268db6f01b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kompose-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
