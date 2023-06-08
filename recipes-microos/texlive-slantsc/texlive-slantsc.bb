SUMMARY = "Access different-shaped small-caps fonts"
DESCRIPTION = "This package enables the use of small capitals in different \
font shapes, e.g., slanted or bold slanted for all fonts that \
provide appropriate font shapes. (Note that a separate .fd file \
is needed to define font shapes such as 'scsl' or 'scit'.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.11svn25007"

RPM_NAME = "texlive-slantsc-2023.201.2.11svn25007-57.1.noarch.rpm"
RPM_HASH = "f408f90470520733a85966f9a409c91a0590a90fc3b300f2479747d55826305f68e64254cef0ba6b9cf1b683ee508004aa2d32aba3f7349887dfe880fb2a3e4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(slantsc.sty) texlive-slantsc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
