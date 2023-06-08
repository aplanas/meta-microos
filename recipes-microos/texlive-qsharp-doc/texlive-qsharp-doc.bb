SUMMARY = "Documentation for texlive-qsharp"
DESCRIPTION = "This package includes the documentation for texlive-qsharp"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.1901.1401svn49722"

RPM_NAME = "texlive-qsharp-doc-2023.201.0.0.3.1901.1401svn49722-53.1.noarch.rpm"
RPM_HASH = "5a8f231a3ae4cc8dc2d9cd49ad081f0a22b68d6822bc71e9333b52a4ebf28246e3fb0cfaeaf1c23050528a15b07480f9141af0efd65dd334d8752bbc6ddd28f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qsharp-doc"
RDEPENDS:${PN} += ""

inherit rpm
