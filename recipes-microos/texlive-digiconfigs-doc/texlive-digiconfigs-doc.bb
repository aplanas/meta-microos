SUMMARY = "Documentation for texlive-digiconfigs"
DESCRIPTION = "This package includes the documentation for texlive-digiconfigs"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn15878"

RPM_NAME = "texlive-digiconfigs-doc-2023.201.0.0.5svn15878-52.1.noarch.rpm"
RPM_HASH = "edab56419293490c9eed1986fe8cce6b460dafdc0e5629f2b540039ca37546a9a198237e8e0d3712fc9a6d166a24f64557b28c64da231c696fb2087d0352722c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-digiconfigs-doc"
RDEPENDS:${PN} += ""

inherit rpm
