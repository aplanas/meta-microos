SUMMARY = "Bash Completion for kubernetes1.24-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.24-client"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-client-bash-completion-1.24.13-2.1.noarch.rpm"
RPM_HASH = "1e2630ae503d23d458ec86d5b2f1f333fcd2b70578e6c3b72670887c24b1366dfcccd376eeafd1d26617f2dece7765db792c66c18e5511e4b7da4f6d42e9c328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion kubernetes1.24-client-bash-completion"
RDEPENDS:${PN} += "bash-completion kubernetes1.24-client"

inherit rpm
