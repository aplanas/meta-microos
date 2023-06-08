SUMMARY = "Documentation for texlive-pagecont"
DESCRIPTION = "This package includes the documentation for texlive-pagecont"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-pagecont-doc-2023.201.1.0svn15878-51.1.noarch.rpm"
RPM_HASH = "a92f58849c5dd08874d058e7c60646a6d3c7dbb3b7fc421c7812ce4c347a30ea3dd2afe40a60386dbd9bc97161e15b26e6e30148e559747b6712c19a0606287e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagecont-doc"
RDEPENDS:${PN} += ""

inherit rpm
