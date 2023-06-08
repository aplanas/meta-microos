SUMMARY = "Bash Completion for kubernetes1.27-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.27-client"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-client-bash-completion-1.27.1-1.1.noarch.rpm"
RPM_HASH = "65daf038d4a96de402ecacaf3bfa05f964b1baf73110ac14bc00b080b5f96363b7c9194f17db22cfbc336884c5d219d9f1d4d8115d7c1db41f1162e3cefbdd1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion kubernetes1.27-client-bash-completion"
RDEPENDS:${PN} += "bash-completion kubernetes1.27-client"

inherit rpm
