SUMMARY = "Documentation for texlive-g-brief"
DESCRIPTION = "This package includes the documentation for texlive-g-brief"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0.3svn50415"

RPM_NAME = "texlive-g-brief-doc-2023.201.4.0.3svn50415-52.1.noarch.rpm"
RPM_HASH = "eaf4a4ef2877aaebd5729a44d346548107af8076528b4ef144994f29ecaa9c5c960feae6ebedd210cc760e1868d50e3302b9c5c0837842c12d2640142ec39901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-g-brief-doc:de) texlive-g-brief-doc"
RDEPENDS:${PN} += ""

inherit rpm
