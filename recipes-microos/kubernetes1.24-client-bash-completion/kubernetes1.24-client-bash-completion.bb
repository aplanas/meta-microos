SUMMARY = "Bash Completion for kubernetes1.24-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.24-client"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-client-bash-completion-1.24.13-2.2.noarch.rpm"
RPM_HASH = "354511291b0eb9d0ae9510448d5773dd65bbf6ea91cc3747b149aa2033c90a6dfef5b896fef03a88cd2be128f09bfb41f4f3dee37670c2036ed6030027312bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.24-client-bash-completion"
RDEPENDS:${PN} += "bash-completion \
kubernetes1.24-client"

inherit rpm
