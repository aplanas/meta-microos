SUMMARY = "Documentation for texlive-context-cmttbf"
DESCRIPTION = "This package includes the documentation for texlive-context-cmttbf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-cmttbf-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "c5b81bdf51199302ad33abe9c54af49ea845a47aa5767ae311e4d4ce858f4e152f77f0995b51894c6aa6b61b79d69cfc4ef362b5ae68c69be91f4e6c089e15d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-cmttbf-doc"
RDEPENDS:${PN} += ""

inherit rpm
