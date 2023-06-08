SUMMARY = "Typeset Korean with Xe(La)TeX"
DESCRIPTION = "The package supports typesetting Korean documents (including \
old Hangul texts), using XeTeX. It enhances the existing \
support, in XeTeX, providing features that provide quality \
typesetting. This package requires the cjk-ko package for its \
full functionality."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn64894"

RPM_NAME = "texlive-xetexko-2023.201.4.2svn64894-52.1.noarch.rpm"
RPM_HASH = "5cc19b7da2c05af3dfa478d859427334736fd57b5d28291029ae75e2bdcdf507c33712c012a289cbaf1c7f066223efdc231976bc0685ed4e013ad6c49f211006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xetexko-font.sty) tex(xetexko-hanging.sty) tex(xetexko-josa.sty) tex(xetexko-space.sty) tex(xetexko-vertical.sty) tex(xetexko.sty) texlive-xetexko"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontspec.sty) tex(kolabels-utf.sty) tex(konames-utf.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
