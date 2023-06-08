SUMMARY = "Documentation for texlive-domitian"
DESCRIPTION = "This package includes the documentation for texlive-domitian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn55286"

RPM_NAME = "texlive-domitian-doc-2023.201.1.0.1svn55286-52.1.noarch.rpm"
RPM_HASH = "9c603eda1d1efd41ddf24f6c17ee039dcabfb38df810b1143e8437a4022da8b89dee333512bd45b20df966eecfca7d92a7c780d19d63bd1d120a2b770b415a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-domitian-doc"
RDEPENDS:${PN} += ""

inherit rpm
