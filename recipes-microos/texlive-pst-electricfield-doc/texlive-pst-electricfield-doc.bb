SUMMARY = "Documentation for texlive-pst-electricfield"
DESCRIPTION = "This package includes the documentation for texlive-pst-electricfield"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.14svn29803"

RPM_NAME = "texlive-pst-electricfield-doc-2023.201.0.0.14svn29803-52.1.noarch.rpm"
RPM_HASH = "8a340b01b3cbe489dd2138d52cdb013f597969fdd624d66c07d2d650debfd4ea3fd280da6a962da3af80c17b917bfe9a266ea261f8e8d6f6e4248eeaf9482a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-electricfield-doc:de;en;fr) texlive-pst-electricfield-doc"
RDEPENDS:${PN} += ""

inherit rpm
