SUMMARY = "Documentation for texlive-easy-todo"
DESCRIPTION = "This package includes the documentation for texlive-easy-todo"
LICENSE = "Apache-1.0"

PV = "2023.201.svn32677"

RPM_NAME = "texlive-easy-todo-doc-2023.201.svn32677-53.1.noarch.rpm"
RPM_HASH = "732bf740bb830a048ea21d4a3166c92395d4fe27b0c7658b1af9396df47969f7eb14347008adc5b71f4fd47418811411e3783da0913eb059dc7481fa546d99de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easy-todo-doc"
RDEPENDS:${PN} += ""

inherit rpm
