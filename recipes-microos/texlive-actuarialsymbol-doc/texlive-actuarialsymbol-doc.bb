SUMMARY = "Documentation for texlive-actuarialsymbol"
DESCRIPTION = "This package includes the documentation for texlive-actuarialsymbol"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54080"

RPM_NAME = "texlive-actuarialsymbol-doc-2023.201.1.1svn54080-54.1.noarch.rpm"
RPM_HASH = "a1e76068690829943de8359aae4541559fc2749724ae01d8ef82e4a2791133b38767b920a7358f461614a806497f88d6056f6eebd0c81fcb080994c2f76a7f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-actuarialsymbol-doc"
RDEPENDS:${PN} += ""

inherit rpm
