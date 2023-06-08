SUMMARY = "Documentation for texlive-nostarch"
DESCRIPTION = "This package includes the documentation for texlive-nostarch"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-nostarch-doc-2023.201.1.3svn15878-54.1.noarch.rpm"
RPM_HASH = "e5271f4cd2cc69628913ad4b92da7c2ab7611f713d9d4dc29047ac75ef754a09dd50afe8e3efc15cf20d9bba065465e19d81e25309af7dc584efc90035baa28b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nostarch-doc"
RDEPENDS:${PN} += ""

inherit rpm
