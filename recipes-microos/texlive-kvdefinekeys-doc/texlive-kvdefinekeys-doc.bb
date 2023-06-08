SUMMARY = "Documentation for texlive-kvdefinekeys"
DESCRIPTION = "This package includes the documentation for texlive-kvdefinekeys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn53193"

RPM_NAME = "texlive-kvdefinekeys-doc-2023.201.1.6svn53193-55.1.noarch.rpm"
RPM_HASH = "f24ac1b18cb6f49b354c9b0f8e3d6bb873ce81d87cffa0c7b8c6b79d946ea97440c4c09f3ed10fe1642b89215e49b928f639dcac90a56374644337dc5a2dc4e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kvdefinekeys-doc"
RDEPENDS:${PN} += ""

inherit rpm
