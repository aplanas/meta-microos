SUMMARY = "Pre-commit git hook for LaTeX package developpers"
DESCRIPTION = "This package provides a pre-commit git hook to check basic \
LaTeX syntax for the use of package developers. It is installed \
by copying it into the .git/.hooks file. It then checks the \
following file types: .sty, .dtx, .bbx, .cbx, and .lbx. List of \
performed checks: Each line must be terminated by a %, without \
a space before it. Empty lines are allowed, but not lines with \
nothing but spaces in them. \\begin{macro} and \\end{macro} must \
be paired. \\begin{macrocode} and \\end{macrocode} must be \
paired. \\begin{macro} must have a second argument. One space \
must be printed between % and \\begin{macro} or \\end{macro}. % \
must be the first character in the line. Four spaces must be \
printed between % and \\begin{macrocode} or \\end{macrocode}. \\cs \
argument must not start with a backslash."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1.2svn41378"

RPM_NAME = "texlive-hook-pre-commit-pkg-2023.201.1.1.2svn41378-53.1.noarch.rpm"
RPM_HASH = "18a96407650da9e0e76d38ab81b18d53ce3dc7e6affd110efa4d242ee8dad2945a0f1da619dc80c6e8bd78c033a091b584cea7d7af76affd89028cb54e98d406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hook-pre-commit-pkg"
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
