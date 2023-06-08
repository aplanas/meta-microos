SUMMARY = "Documentation for texlive-dyntree"
DESCRIPTION = "This package includes the documentation for texlive-dyntree"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-dyntree-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "42eeb739d1e32799dbef806af1509a5111a267891da827498418137de0bf48aedd661bfbf881b9bafdbc229c8fc92fd5f4c139b355bf6a3e9e9885171ff70d59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dyntree-doc"
RDEPENDS:${PN} += ""

inherit rpm
