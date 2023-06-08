SUMMARY = "E-TeX tools for LaTeX users and package writers"
DESCRIPTION = "The package provides many (purely expandable) tools for LaTeX: \
Extensive list management (csv lists, lists of single \
tokens/characters, etoolbox lists); purely expandable loops \
(csvloop, forcsvloop, etc.); conversion (csvtolist, etc.)); \
addition/deletion (csvadd, listdel, etc.); Expansion and group \
control: \\expandnext, \\ExpandAfterCmds, \\AfterGroup...; Tests \
on tokens, characters and control sequences (\\iffirstchar, \
\\ifiscs, \\ifdefcount, \\@ifchar...); Tests on strings \
(\\ifstrnum, \\ifuppercase, \\DeclareStringFilter...); Purely \
expandable macros with options (\\FE@testopt, \\FE@ifstar) or \
modifiers (\\FE@modifiers); Some purely expandable numerics \
(\\interval, \\locinterplin). The package is dependent on the \
etex and the etoolbox packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1415926svn20694"

RPM_NAME = "texlive-etextools-2023.201.3.1415926svn20694-52.1.noarch.rpm"
RPM_HASH = "ccaf227bc2333b90b21c4c10a32c473e4d0f4ec201a19f93e5f5020d1f36ea1c78d0bb305d9a0f5b6ec93fbb0b6d401fbf5c8b8121e98a9619fa440b01eb73da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(etextools.sty) texlive-etextools"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etex.sty) tex(etoolbox.sty) tex(letltxmacro.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
