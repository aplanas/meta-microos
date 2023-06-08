SUMMARY = "A class for NIH grant applications"
DESCRIPTION = "The nih class offers support for grant applications to NIH, the \
National Institutes of Health, a US government agency. The \
example-* files provide a template for using nih.cls and \
submitting the biographical sketches the NIH wants. They \
(potentially) use denselists package, which just reduces list \
spacing; the package is distributed with the class, but is not \
part of the class proper. (The examples may be distributed \
without even the restrictions of the LaTeX licence.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-nih-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "9a5d12e037bf8718d960a9323361a6f4eb7018802bcb76c22f87c0bdd6c6bccb5731fdb0010183384d107eab0e91f9040ff371668a3c2a849154a5a098ddeda3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(denselists.sty) tex(nih.cls) texlive-nih"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(fancyhdr.sty) tex(geometry.sty) tex(helvet.sty) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
