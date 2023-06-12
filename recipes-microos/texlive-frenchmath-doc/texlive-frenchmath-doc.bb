SUMMARY = "Documentation for texlive-frenchmath"
DESCRIPTION = "This package includes the documentation for texlive-frenchmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn66470"

RPM_NAME = "texlive-frenchmath-doc-2023.201.2.6svn66470-52.1.noarch.rpm"
RPM_HASH = "fdef7b87dff19daee3f5d95c1158c12989b84b27cd1375f04c780cf458f9d96186a759baa0f98224024d6e23530ffd006c55095a4a4881a8a5c9e163bbd7258e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-frenchmath-doc:fr) \
texlive-frenchmath-doc"
RDEPENDS:${PN} += ""

inherit rpm
