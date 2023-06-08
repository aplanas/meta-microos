SUMMARY = "Mark hyphenations in a document, for checking"
DESCRIPTION = "The package looks at all hyphenation breaks in the document, \
comparing them against a white-list prepared by the author. If \
a hyphenation break is found, for which there is no entry in \
the white-list, the package flags the line where the break \
starts. The author may then either add the hyphenation to the \
white-list, or adjust the document to avoid the break."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7asvn47527"

RPM_NAME = "texlive-lua-check-hyphen-2023.201.0.0.7asvn47527-52.1.noarch.rpm"
RPM_HASH = "e4340eabe776be771599e5d666adb98a8332fbbaa13be9019aff2b3e299728ce1961e51cb7006f23f87fff6ee2bd3d74a51336254ba9c037aa1168cd44697655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lua-check-hyphen.sty) texlive-lua-check-hyphen"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifluatex.sty) tex(keyval.sty) tex(luatexbase.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
