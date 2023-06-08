SUMMARY = "Bash Completion for kubernetes1.25-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.25-client"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-client-bash-completion-1.25.9-1.1.noarch.rpm"
RPM_HASH = "6a3aaa3308f51f83641a3189001cc05d16999c55362df3d133c8cf56ee17b32fca4e99419fe7d1046454edd004a8258b4fe115b1d108dc752223da67c14f759b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion kubernetes1.25-client-bash-completion"
RDEPENDS:${PN} += "bash-completion kubernetes1.25-client"

inherit rpm
