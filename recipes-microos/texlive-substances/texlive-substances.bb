SUMMARY = "A database of chemicals"
DESCRIPTION = "The package provides the means to create a database-like file \
that contains data of various chemicals. These data may be \
retrieved in the document; an index of the chemicals mentioned \
in the document can be created.."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2asvn40989"

RPM_NAME = "texlive-substances-2023.201.0.0.2asvn40989-57.1.noarch.rpm"
RPM_HASH = "a4bf2ef6733309b8736d545be23770dae66bf860f7ab21d2116f95b8e7bef3ea7da940037eee85321045ad33a4c450a228da342f44729565eb9c9017f9dd9cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(substances-default.def) tex(substances.sty) texlive-substances"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(chemfig.sty) tex(chemmacros.sty) tex(expl3.sty) tex(ghsystem.sty) tex(l3keys2e.sty) tex(siunitx.sty) tex(xparse.sty) tex(xtemplate.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
