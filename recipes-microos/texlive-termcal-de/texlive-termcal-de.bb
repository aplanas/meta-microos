SUMMARY = "German localization for termcal"
DESCRIPTION = "This package provides a German localization to the termcal \
package written by Bill Mitchell, which is intended to print a \
term calendar for use in planning a class. termcal-de depends \
on the following other packages: termcal, pgfkeys, pgfopts, \
datetime2, and datetime2-german."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn47111"

RPM_NAME = "texlive-termcal-de-2023.201.2.0svn47111-54.1.noarch.rpm"
RPM_HASH = "4eb1bdff86d63fd2ee742dc61fb35860647a2ff0e0bdd3f15a271ea23851769667d05e36c3393f2596819b4933c2af62be65faceb58027483e95264bf6b1874e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(termcal-de.sty) texlive-termcal-de"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(datetime2.sty) tex(pgfkeys.sty) tex(pgfopts.sty) tex(termcal.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
