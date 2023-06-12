SUMMARY = "Patch \\marginpar to avoid overfull margins"
DESCRIPTION = "Authors using LaTeX to typeset books with significant margin \
material often run into the problem of long notes running off \
the bottom of the page. A typical workaround is to insert \
\\vshift commands by hand, but this is a tedious process that is \
invalidated when pagination changes. Another workaround is \
memoir's \\sidebar function, but this can be unsatisfying for \
short textual notes, and standard marginpars cannot be mixed \
with sidebars. This package implements a solution to make \
marginpars 'just work' by keeping a list of floating inserts \
and arranging them intelligently in the output routine."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn55064"

RPM_NAME = "texlive-marginfix-2023.201.1.2svn55064-52.1.noarch.rpm"
RPM_HASH = "e00757e3349bf65a54702fe1578c6dfcaba3c8fc8dfaa90af3f81e20764fda106e900e0091bb8d9e1e017abf3c1fe5aebd05011df69a61e11651b69da823cf59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(marginfix.sty) \
texlive-marginfix"
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
