SUMMARY = "Documentation for texlive-luainputenc"
DESCRIPTION = "This package includes the documentation for texlive-luainputenc"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.973svn20491"

RPM_NAME = "texlive-luainputenc-doc-2023.201.0.0.973svn20491-52.1.noarch.rpm"
RPM_HASH = "cbf89b0d5c84738f4a3a7af19544ce920fe9a4220ae836a313802f8ceac32d7edbe6e6235f4fcd26eaba8f62a21c534036733cfa122de59aae56bb78523d7dd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luainputenc-doc"
RDEPENDS:${PN} += ""

inherit rpm
