SUMMARY = "Symbols collection for typesetting Sequential Function Chart (SFC) diagrams (PLC programs)"
DESCRIPTION = "This package contains a collection of symbols for typesetting \
Sequential Function Chart (SFC) diagrams in agreement with the \
international standard IEC-61131-3/2013. It includes steps \
(normal and initial), transitions, actions and actions \
qualifiers (with and without time duration). It extends the \
circuit library of TikZ and allows you to draw an SFC diagram \
in same way you would draw any other circuit."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn49424"

RPM_NAME = "texlive-tikz-sfc-2023.201.1.0.1svn49424-52.1.noarch.rpm"
RPM_HASH = "0126634d5e6843d74f9af7291ced18a062150b3104929a42030f18d09e8fafa96f6c49fa2cf8e72f79b4f1bbd06787ab2acd290f378573793f06a8ea9be2e618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzlibrarycircuits.plc.sfc.code.tex) texlive-tikz-sfc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
