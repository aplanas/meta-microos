SUMMARY = "A 'dimen' that returns the space left on the line"
DESCRIPTION = "The linegoal package provides a macro \\linegoal to be used with \
\\setlength: \\setlength<some dimen>\\linegoal will set <some \
dimen> to the horizontal length of the remainder of the line. \
This is achieved using the \\pdfsavepos primitive of pdfTeX, \
through the zref-savepos package. Example: Some text: \
\\begin{tabularx}\\linegoal{|l|X|} \\hline one & two \\\\ three & \
four \\\\\\hline \\end{tabularx} will position the table after the \
initial text, and make the table fill the rest of the line."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.9svn21523"

RPM_NAME = "texlive-linegoal-2023.201.2.9svn21523-54.1.noarch.rpm"
RPM_HASH = "a8dcb44515add23123c997dc89fac27b2e157982441629dfd024499bb73a2046ffed4342de85221504b9cc0d22b224cbf1cfd8247b265134db10179a1d6e1f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(linegoal.sty) \
texlive-linegoal"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etex.sty) \
tex(zref-savepos.sty) \
tex(zref.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
