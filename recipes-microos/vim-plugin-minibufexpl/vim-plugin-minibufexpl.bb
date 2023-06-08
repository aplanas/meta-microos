SUMMARY = "Elegant buffer explorer that takes very little screen space"
DESCRIPTION = "Minibufexplorer allows to quickly switch buffers by double-clicking the \
appropriate 'tab'. Tabs get updated as buffers are opened and closed. \
Buffers that are modified get visually marked and buffers that are open in a \
window get visually marked."
LICENSE = "ISC"

PV = "6.3.2"

RPM_NAME = "vim-plugin-minibufexpl-6.3.2-55.1.noarch.rpm"
RPM_HASH = "edaf82a1469df37295a7d9162887f94a80fd96407678bd092e431ba73581f05bb4eb542b26cf3833884780d8cd1ce43e5420eff544b7fbff055a9f9798e43197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-minibufexpl"
RDEPENDS:${PN} += "vim"

inherit rpm
