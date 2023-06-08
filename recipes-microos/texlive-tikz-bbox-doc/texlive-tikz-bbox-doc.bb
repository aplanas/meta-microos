SUMMARY = "Documentation for texlive-tikz-bbox"
DESCRIPTION = "This package includes the documentation for texlive-tikz-bbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn57444"

RPM_NAME = "texlive-tikz-bbox-doc-2023.201.0.0.1svn57444-54.1.noarch.rpm"
RPM_HASH = "80591c5de30c1d87ccc54e9acb5995b250d5d7cfb5214cdc076cbbc4dfa9f4727e17c9e7e981dbe41ac965d90a8e6c68202553aab054677ef2011c4a06cd0c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-bbox-doc"
RDEPENDS:${PN} += ""

inherit rpm
