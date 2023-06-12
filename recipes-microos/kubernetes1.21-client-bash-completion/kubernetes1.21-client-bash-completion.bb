SUMMARY = "Bash Completion for kubernetes1.21-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.21-client"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-client-bash-completion-1.21.14-2.2.noarch.rpm"
RPM_HASH = "001a8c8e1aa8b0c48ed817e4f6851eea1a5f18d41f0e77133af5856a04e472e6408f62150bfa484ed54e04a082f57736ee000b799216a1be44c691f71c031f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion kubernetes1.21-client-bash-completion"
RDEPENDS:${PN} += "bash-completion kubernetes1.21-client"

inherit rpm
