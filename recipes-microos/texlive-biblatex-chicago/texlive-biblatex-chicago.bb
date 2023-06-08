SUMMARY = "Chicago style files for BibLaTeX"
DESCRIPTION = "This is a BibLaTeX style that implements the Chicago \
'author-date' and 'notes with bibliography' style \
specifications given in the Chicago Manual of Style, 17th \
edition (with continuing support for the 16th edition, too). \
The style implements entry types for citing audio-visual \
materials, among many others. The package was previously known \
as biblatex-chicago-notes-df."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3asvn65037"

RPM_NAME = "texlive-biblatex-chicago-2023.201.2.3asvn65037-53.1.noarch.rpm"
RPM_HASH = "63e29f5a7c1a9a8917575a38d36d1890dfd0ab518bb73de30c639a84cce5414953aa42a090cd996b2fb6903051a6e4a21203cb43cb8e7a28486b2231e566d3de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(biblatex-chicago.sty) tex(chicago-authordate-trad.bbx) tex(chicago-authordate-trad.cbx) tex(chicago-authordate-trad16.bbx) tex(chicago-authordate-trad16.cbx) tex(chicago-authordate.bbx) tex(chicago-authordate.cbx) tex(chicago-authordate16.bbx) tex(chicago-authordate16.cbx) tex(chicago-dates-common.cbx) tex(chicago-dates-common16.cbx) tex(chicago-notes.bbx) tex(chicago-notes.cbx) tex(chicago-notes16.bbx) tex(chicago-notes16.cbx) tex(cms-american.lbx) tex(cms-brazilian.lbx) tex(cms-british.lbx) tex(cms-dutch.lbx) tex(cms-finnish.lbx) tex(cms-french.lbx) tex(cms-german.lbx) tex(cms-icelandic.lbx) tex(cms-ngerman.lbx) tex(cms-norsk.lbx) tex(cms-norwegian.lbx) tex(cms-nynorsk.lbx) tex(cms-romanian.lbx) tex(cms-spanish.lbx) tex(cms-swedish.lbx) tex(cmsdocs.sty) tex(cmsendnotes.sty) texlive-biblatex-chicago"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(biblatex.sty) tex(endnotes.sty) tex(etoolbox.sty) tex(expl3.sty) tex(hyperref.sty) tex(kvoptions.sty) tex(listings.sty) tex(nameref.sty) tex(refcount.sty) tex(xcolor.sty) tex(xparse.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
