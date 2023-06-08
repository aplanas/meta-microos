SUMMARY = "Macros for use in the author's documentation"
DESCRIPTION = "The package is not advertised for public use, but is necessary \
for the support of others of the author's packages (which are \
compiled under the ltxdoc class)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24500"

RPM_NAME = "texlive-fcltxdoc-2023.201.1.0svn24500-52.1.noarch.rpm"
RPM_HASH = "05cfa092cf4d7503bb56fdcea60b75b16a1a0ca7a33a8914f977cf736c797715aa4089ebda04c2c8a57ab652dce183868926e632b11842a329554f65cedb53af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fcltxdoc.sty) texlive-fcltxdoc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsfonts.sty) tex(amsmath.sty) tex(amsopn.sty) tex(amssymb.sty) tex(array.sty) tex(bbding.sty) tex(bookmark.sty) tex(booktabs.sty) tex(delarray.sty) tex(embedfile.sty) tex(enumitem.sty) tex(etexcmds.sty) tex(etoolbox.sty) tex(eurosym.sty) tex(fancyhdr.sty) tex(fancyvrb.sty) tex(filehook.sty) tex(fontenc.sty) tex(framed.sty) tex(graphicx.sty) tex(grffile.sty) tex(hologo.sty) tex(hypbmsec.sty) tex(hypdoc.sty) tex(hyperref.sty) tex(interfaces.sty) tex(lastpage.sty) tex(linegoal.sty) tex(listings.sty) tex(ltxcmds.sty) tex(ltxnew.sty) tex(makecell.sty) tex(manfnt.sty) tex(marginnote.sty) tex(moresize.sty) tex(nccfoots.sty) tex(nccstretch.sty) tex(needspace.sty) tex(pdftexcmds.sty) tex(relsize.sty) tex(titlesec.sty) tex(tocloft.sty) tex(ulem.sty) tex(xcolor.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
