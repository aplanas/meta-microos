SUMMARY = "Bash Completion for kubernetes1.27-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.27-client"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-client-bash-completion-1.27.1-1.2.noarch.rpm"
RPM_HASH = "cabf98ca80af70a47d707db5cb6a7d8870d7321f2505fd1491f8a7c5e5d14855ef9d1371e530773210573e7d96a10420b453b4e7b3779de87cddf9fe194aeafb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.27-client-bash-completion"
RDEPENDS:${PN} += "bash-completion \
kubernetes1.27-client"

inherit rpm
