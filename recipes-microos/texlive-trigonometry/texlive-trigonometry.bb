SUMMARY = "Demonstration code for cos and sin in TeX macros"
DESCRIPTION = "A document that both provides macros that are usable elsewhere, \
and demonstrates the macros. The code uses the 'classical' \
analytical expansion of sin and cos (the more recent trig uses \
a 'numerical analyst's' expansion)."
LICENSE = "SUSE-TeX"

PV = "2023.201.svn43006"

RPM_NAME = "texlive-trigonometry-2023.201.svn43006-52.1.noarch.rpm"
RPM_HASH = "4146c2324c5cf50d1d793f3a32b0be038a2eb27a5df26fcff986de125ac74ca34ca2c16ece6ebded821d6afd8d9231a0e9c46ac2718cb4baece461e9c03be4a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(trigonometry.tex) texlive-trigonometry"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
