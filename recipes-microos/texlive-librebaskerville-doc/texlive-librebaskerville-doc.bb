SUMMARY = "Documentation for texlive-librebaskerville"
DESCRIPTION = "This package includes the documentation for texlive-librebaskerville"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64421"

RPM_NAME = "texlive-librebaskerville-doc-2023.201.svn64421-54.1.noarch.rpm"
RPM_HASH = "293557bf4c7176b519d6ddf4a2d8a2f9f661881221d5ab637804fadea655c83c52ca2283799a1ae7f8af62c8c7f6aa3db6175c148078d1f67a773eb95400340b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librebaskerville-doc"
RDEPENDS:${PN} += ""

inherit rpm
