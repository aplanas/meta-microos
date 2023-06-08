SUMMARY = "Documentation for texlive-memexsupp"
DESCRIPTION = "This package includes the documentation for texlive-memexsupp"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-memexsupp-doc-2023.201.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "4717355909d94b82c5e36264bef8f717c4eab7b5b2749ee877098756d9ed60f73ca7c877d2e8fd2081a68eeb68c2581501a8b9848bf1d9c2489e09f56ca05d08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memexsupp-doc"
RDEPENDS:${PN} += ""

inherit rpm
