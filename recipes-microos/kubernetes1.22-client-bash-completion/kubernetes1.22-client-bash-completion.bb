SUMMARY = "Bash Completion for kubernetes1.22-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.22-client"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-client-bash-completion-1.22.17-2.1.noarch.rpm"
RPM_HASH = "8592a6bd1fdd35a03b2b876b6eb6968759577447ba13aad6e7fdb2e57a9f718d8b9a4d8522a7ab758b62454a5a79cec521d5ae95f5f2824ab2ee77bd43156d81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion kubernetes1.22-client-bash-completion"
RDEPENDS:${PN} += "bash-completion kubernetes1.22-client"

inherit rpm
