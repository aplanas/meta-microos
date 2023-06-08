SUMMARY = "Create correct hyperlinks for DOI numbers"
DESCRIPTION = "You can hyperlink DOI numbers to doi.org. However, some \
publishers have elected to use nasty characters in their DOI \
numbering scheme ('<', '>', '_' and ';' have all been spotted). \
This will either upset (La)TeX, or your PDF reader. This \
package contains a single user-level command \\doi{}, which \
takes a DOI number, and creates a correct hyperlink to the \
target of the DOI."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48634"

RPM_NAME = "texlive-doi-2023.201.svn48634-52.1.noarch.rpm"
RPM_HASH = "0365193128670f212713b1144d1ebdaf04b2731592b586790d211a538597953a89d75ca4cc2c6cad469739efc420376b866a8928bf2f69cff7976653e5771272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(doi.sty) texlive-doi"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(hyperref.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
