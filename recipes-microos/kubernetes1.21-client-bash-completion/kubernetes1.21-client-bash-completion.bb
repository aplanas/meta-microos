SUMMARY = "Bash Completion for kubernetes1.21-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.21-client"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-client-bash-completion-1.21.14-2.1.noarch.rpm"
RPM_HASH = "18a89fa9da3d7e3c2c7bb49d168164e08b6d03d901eddcf02256ea94eb6838a544932f9f49d7442d5702f058e87a27ebb5efe44a0ab3e0dea581a58f22581698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion kubernetes1.21-client-bash-completion"
RDEPENDS:${PN} += "bash-completion kubernetes1.21-client"

inherit rpm
