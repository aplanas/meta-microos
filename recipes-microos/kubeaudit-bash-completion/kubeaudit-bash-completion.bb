SUMMARY = "Bash Completion for kubeaudit"
DESCRIPTION = "Bash command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubeaudit-bash-completion-0.22.0-1.2.noarch.rpm"
RPM_HASH = "4025e2c8f5f7ed8fc6866ea4a10284f70ba769d6d86444fe9190836ad624e2dbbe5d3419a93d17f810dd43a9703535051e66bc736a7a21e7a3d1834202fc0a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-bash-completion"
RDEPENDS:${PN} += "bash-completion \
kubeaudit"

inherit rpm
