SUMMARY = "Framed minipages of a specified total width (text and frame combined)"
DESCRIPTION = "The package essentially just wraps a minipage within an \\fbox. \
However, while \
\\fbox{\\begin{minipage}{\\linewidth}...\\end{minipage}} juts out \
into the margin, \\begin{boxedminipage}...\\end{boxedminipage} \
does not. Instead, it subtracts the frame's dimensions from the \
specified dimensions of the minipage before typesetting the \
minipage. Note: The package was formerly known as \
boxedminipage2e and now replaces Mario Wolczko's earlier \
boxedminipage package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54827"

RPM_NAME = "texlive-boxedminipage-2023.201.1.1svn54827-52.1.noarch.rpm"
RPM_HASH = "0aa4ed0e7ee7ef3a3df16d8474715806622ab41f621846382c8b4e3ee5748e1b7d58c233399a067f601dce70d91564bb026643372c961bac11ba2cf441fe3e44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(boxedminipage.sty) tex(boxedminipage2e.sty) texlive-boxedminipage"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
