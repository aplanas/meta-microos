SUMMARY = "Show characters inside a box"
DESCRIPTION = "The package typesets a character inside a box, showing where \
reference point is, and displaying width, height, and depth \
information of the character. The output is like that on page \
63 of 'The TeXBook' or page 101 of 'The METAFONTbook'. The \
package itself is motivated by Knuth's macros in the file \
manmac.tex. Users should note that using a small size for the \
character inside the box does not make any sense: use a large \
size."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29803"

RPM_NAME = "texlive-showcharinbox-2023.201.0.0.1svn29803-53.1.noarch.rpm"
RPM_HASH = "5d5d9bad945aa09c4cd9684f008bccf968776497b52f85c76823eafe1c75340c919a09e40710adfe211cf46decd544a9263c913d4f5bb8d18822119d0f36a5b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(showcharinbox.sty) texlive-showcharinbox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
