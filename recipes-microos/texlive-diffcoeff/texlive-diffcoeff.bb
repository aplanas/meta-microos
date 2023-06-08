SUMMARY = "Write differential coefficients easily and consistently"
DESCRIPTION = "This package allows the easy and consistent writing of \
ordinary, partial and other derivatives of arbitrary (algebraic \
or numeric) order. For mixed partial derivatives, the total \
order of differentiation is calculated by the package. Optional \
arguments allow specification of points of evaluation (ordinary \
derivatives), or variables held constant (partial derivatives), \
and the placement of the differentiand (numerator or appended). \
The package is built on xtemplate and the configurability it \
enables, extending to differentials (including simple line \
elements) and jacobians."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.2svn65676"

RPM_NAME = "texlive-diffcoeff-2023.201.5.2svn65676-52.1.noarch.rpm"
RPM_HASH = "53ae3d4d4e6238a6032c77f31c93599bd5fee4081f0b794702be8a54e4f3451710be469ed669398cd6fe767e55f5b26faf8f18f8d3c26e251c4b30545406ce87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(diffcoeff-doc.def) tex(diffcoeff.sty) tex(diffcoeff4.sty) tex(diffcoeff5.def) texlive-diffcoeff"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(l3keys2e.sty) tex(mleftright.sty) tex(xparse.sty) tex(xtemplate.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
