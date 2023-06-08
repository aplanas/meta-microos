SUMMARY = "Documentation for texlive-lwarp"
DESCRIPTION = "This package includes the documentation for texlive-lwarp"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.911svn66259"

RPM_NAME = "texlive-lwarp-doc-2023.201.0.0.911svn66259-52.1.noarch.rpm"
RPM_HASH = "aef0f1ae2218960a64820e808bfbe1786e7c25d685467b21f7d3d21ee337000d8e05d2a73e4fb6ff60c900d19cc6a5eb92f80e10874133a12d6b7579f540a178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lwarp-doc"
RDEPENDS:${PN} += ""

inherit rpm
