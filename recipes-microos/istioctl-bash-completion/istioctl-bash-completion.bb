SUMMARY = "Bash Completion for istioctl"
DESCRIPTION = "Bash command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.17.2"

RPM_NAME = "istioctl-bash-completion-1.17.2-2.1.noarch.rpm"
RPM_HASH = "2e1541273b82fbf31af2c590cfea2a8cfa8988fc2c1812aa657aff93aa495f18f270c8f35220222b9a80d77334dde5a0c0ecfbdba8fa349516a0500d5f3cbd21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-bash-completion"
RDEPENDS:${PN} += "bash-completion istioctl"

inherit rpm
