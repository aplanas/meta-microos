SUMMARY = "Bash Completion for kubernetes1.20-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.20-client"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-client-bash-completion-1.20.15-2.1.noarch.rpm"
RPM_HASH = "8e93e37d9145659711daf9234ed23f8dde86a2374d1b9239a059fb16d5f7524dfff19708264f11de0aa3c34ad5c66b1cbdc61cdd8c5cf227d838360bc5aef595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion kubernetes1.20-client-bash-completion"
RDEPENDS:${PN} += "bash-completion kubernetes1.20-client"

inherit rpm
