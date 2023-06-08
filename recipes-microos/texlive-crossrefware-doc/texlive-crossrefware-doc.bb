SUMMARY = "Documentation for texlive-crossrefware"
DESCRIPTION = "This package includes the documentation for texlive-crossrefware"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn64754"

RPM_NAME = "texlive-crossrefware-doc-2023.204.svn64754-54.1.noarch.rpm"
RPM_HASH = "5e6da43e5ff758ebc6af5b27195f8cad65375d7b3b8830203ab1c143097dc1ac78997eb7a78760882693d377d649d4f82ee5a00f40754c5f7f6c02284c5df56c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(bbl2bib.1) man(bibdoiadd.1) man(bibmradd.1) man(biburl2doi.1) man(bibzbladd.1) man(ltx2crossrefxml.1) texlive-crossrefware-doc"
RDEPENDS:${PN} += ""

inherit rpm
