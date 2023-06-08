SUMMARY = "Fish Completion for kubernetes1.27-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.27-client."
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-client-fish-completion-1.27.1-1.1.noarch.rpm"
RPM_HASH = "b5af3f08aaaf7119a2a3e6a77a2f596ada84b3c0dd684a58c338d1e870c729ae67e591fdb71c1bc1490c61c600f106a121b583fa2715d6261a89eacca8c6a61a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion kubernetes1.27-client-fish-completion"
RDEPENDS:${PN} += "kubernetes1.27-client"

inherit rpm
