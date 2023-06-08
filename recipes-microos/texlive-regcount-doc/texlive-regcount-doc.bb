SUMMARY = "Documentation for texlive-regcount"
DESCRIPTION = "This package includes the documentation for texlive-regcount"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn19979"

RPM_NAME = "texlive-regcount-doc-2023.201.1.0svn19979-53.1.noarch.rpm"
RPM_HASH = "173d7603d72ee2bfd1d96a395b52db3e09601b3e35a79be24581dc94f072ebc5db749eda58163ccf52dc8b8b6980847e1f74e8ce5e77958d6655db906fcedf61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regcount-doc"
RDEPENDS:${PN} += ""

inherit rpm
