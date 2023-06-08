SUMMARY = "Documentation for texlive-oldstandard"
DESCRIPTION = "This package includes the documentation for texlive-oldstandard"
LICENSE = "OFL-1.1"

PV = "2023.201.2.6svn64464"

RPM_NAME = "texlive-oldstandard-doc-2023.201.2.6svn64464-54.1.noarch.rpm"
RPM_HASH = "7c4ee094989db63ecc3cb71658d70da5babb435af549c38e8c6477594ba57a55d3a8c58fed14337b10e354598faa3492ed376aaa8184041e88608f1679180273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oldstandard-doc"
RDEPENDS:${PN} += ""

inherit rpm
