SUMMARY = "Documentation for texlive-beamerappendixnote"
DESCRIPTION = "This package includes the documentation for texlive-beamerappendixnote"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn55732"

RPM_NAME = "texlive-beamerappendixnote-doc-2023.201.1.2.0svn55732-53.1.noarch.rpm"
RPM_HASH = "5ca200466fbb2c577fe1f5d63b96a9141cb0d9a9c86b96020132fc77ee27e1f685737411010e86a0921a6a9b5901c7523ddb6e1602a0c4fb5e65d839c27fbcc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerappendixnote-doc"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
