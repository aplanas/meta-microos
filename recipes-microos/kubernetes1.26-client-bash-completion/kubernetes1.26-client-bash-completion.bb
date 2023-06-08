SUMMARY = "Bash Completion for kubernetes1.26-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.26-client"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-client-bash-completion-1.26.4-1.1.noarch.rpm"
RPM_HASH = "935935e05b2f30da7e90fd66fb16d33e88c5b48b1ee678e6e8b72ccc0e8425b53776149b7310c7866079c700b2c0b0de756aa3896e30467b05dc503df0a0120a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion kubernetes1.26-client-bash-completion"
RDEPENDS:${PN} += "bash-completion kubernetes1.26-client"

inherit rpm
