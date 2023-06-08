SUMMARY = "Documentation for texlive-crefthe"
DESCRIPTION = "This package includes the documentation for texlive-crefthe"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn64498"

RPM_NAME = "texlive-crefthe-doc-2023.204.svn64498-54.1.noarch.rpm"
RPM_HASH = "ffa16bea2b129df21c89c47c5e474fa24c91ceefbea4c322b66f644281647761ba0c2e7070d2f63b6ff9457d5038c6c1f8ff8ec4283e6c69966aedca12eb8d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crefthe-doc"
RDEPENDS:${PN} += ""

inherit rpm
