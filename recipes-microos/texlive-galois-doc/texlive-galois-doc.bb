SUMMARY = "Documentation for texlive-galois"
DESCRIPTION = "This package includes the documentation for texlive-galois"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-galois-doc-2023.201.1.5svn15878-52.1.noarch.rpm"
RPM_HASH = "e42e60e53c1274eeba839351620752cd3e23bf8fc4983264085de138ad3ce1de6ad4973f8e8801e5e1d9e2f13b806cef598e338007d0567ea5fef33635595795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-galois-doc"
RDEPENDS:${PN} += ""

inherit rpm
