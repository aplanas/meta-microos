SUMMARY = "Documentation for texlive-dantelogo"
DESCRIPTION = "This package includes the documentation for texlive-dantelogo"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.03svn38599"

RPM_NAME = "texlive-dantelogo-doc-2023.204.0.0.03svn38599-54.1.noarch.rpm"
RPM_HASH = "928cd5e0c9efb9c94f6128185ea1eef6f44c57cf62ab971447cc270dc6ff9975387960627b47dbfded8f95fa80f8a20bd12eef54d7b0ecdc444373cae790720e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dantelogo-doc"
RDEPENDS:${PN} += ""

inherit rpm
