SUMMARY = "Documentation for texlive-sageep"
DESCRIPTION = "This package includes the documentation for texlive-sageep"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-sageep-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "21bddba1f1acfbcb6e572276833eaf20b26aab9926d5fac4ce88b771999186de8c3ab2952735f797fe462c432110670cbe0b06203b27e3b01b71921022b047bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sageep-doc"
RDEPENDS:${PN} += ""

inherit rpm
