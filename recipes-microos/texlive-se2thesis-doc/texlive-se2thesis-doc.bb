SUMMARY = "Documentation for texlive-se2thesis"
DESCRIPTION = "This package includes the documentation for texlive-se2thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn65645"

RPM_NAME = "texlive-se2thesis-doc-2023.201.2.1.0svn65645-53.1.noarch.rpm"
RPM_HASH = "4c0ad02d8c71c0ee4e713701de7fcaa868a104e93acb9674a888160912800f06eada63f6668d76952476761f6cbfedd82ecac1b4599516714caee99c38bd036f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-se2thesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
