SUMMARY = "Documentation for texlive-ieeeconf"
DESCRIPTION = "This package includes the documentation for texlive-ieeeconf"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn59665"

RPM_NAME = "texlive-ieeeconf-doc-2023.201.1.4svn59665-52.1.noarch.rpm"
RPM_HASH = "43bd6578fbfe9feb885d884ddbe69f425c4ae72513046deea600bb36c4afd931a2af42f4da8d8de8490e64c7ff4d5336b6d90bf423aa1855a3e034c225abc5b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeeconf-doc"
RDEPENDS:${PN} += ""

inherit rpm
