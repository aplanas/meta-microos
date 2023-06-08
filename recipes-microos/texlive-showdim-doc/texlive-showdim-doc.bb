SUMMARY = "Documentation for texlive-showdim"
DESCRIPTION = "This package includes the documentation for texlive-showdim"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn28918"

RPM_NAME = "texlive-showdim-doc-2023.201.1.2svn28918-53.1.noarch.rpm"
RPM_HASH = "c5b489ea8b352876429b315be64032b0cbaef1406c933b07d7abba2ebce43a84f90c43674052e10d2e0766e9128ad41b55ba42e0588f4711ee9d7c52936d338b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showdim-doc"
RDEPENDS:${PN} += ""

inherit rpm
