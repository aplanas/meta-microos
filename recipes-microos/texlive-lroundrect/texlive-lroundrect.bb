SUMMARY = "LaTeX macros for utilizing the roundrect MetaPost routines"
DESCRIPTION = "This LaTeX package provides ways to use the extremely \
configurable rounded rectangles of the roundrect MetaPost \
package with LaTeX. It is chiefly useful for examples, but also \
has macros for particular types of boxes which are useful on \
their own."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39804"

RPM_NAME = "texlive-lroundrect-2023.201.1.0svn39804-54.1.noarch.rpm"
RPM_HASH = "5444a989e00b84f605d46d3f4749bda36a30b502a4675c3796c65b18c17cc40f1d5b6dc50bfbd731bbdb3095a49e5ee3787dc164ba1d46eca793a3cefc8a809a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lroundrect.sty) texlive-lroundrect"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
