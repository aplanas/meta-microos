SUMMARY = "Documentation for texlive-pkuthss"
DESCRIPTION = "This package includes the documentation for texlive-pkuthss"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.3svn64869"

RPM_NAME = "texlive-pkuthss-doc-2023.201.1.9.3svn64869-51.1.noarch.rpm"
RPM_HASH = "fece6a8bf05e32efe7c51508548a2272e49a528840854a5fbe36db98bdabc3748a93874d9073a933bcbd4d97b52c55081e66cfa42a87c981ac341b05a43b9389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pkuthss-doc:zh) texlive-pkuthss-doc"
RDEPENDS:${PN} += ""

inherit rpm
