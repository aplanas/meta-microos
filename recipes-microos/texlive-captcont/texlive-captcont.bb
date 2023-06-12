SUMMARY = "Retain float number across several floats"
DESCRIPTION = "The captcont package provides the ability to continue the \
numbering in your float environment (figure, table, etc.) with \
minimal overhead. This package adds three commands: \\caption*, \
\\captcont, and \\captcont*. Along with the \\caption command, \
these give full control over the caption numbering, caption \
text and the entries in the list-of pages. The \\caption and \
\\captcont commands generate list-of page entries. The \\caption \
and \\caption* commands increment the figure or table counter. \
Captcont also fully supports the subfigure package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-captcont-2023.201.2.0svn15878-52.1.noarch.rpm"
RPM_HASH = "883741f197a25e20fbd7fd912f89f0a22d86751f8f400af9e81c86d878159023a9d5c4c40081f3f83753626a646fc7047abfbb7140b0abe124f512cd2d516ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(captcont.sty) \
texlive-captcont"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
