SUMMARY = "Define named items and provide back-references with that name"
DESCRIPTION = "The package provides commands to define enumerable items with a \
number and a long name, which can be referenced later with the \
name or just the short form. For instance, 'Milestone M1: \
Specification created' can be defined and later on be \
referenced with 'M1' or 'M1 ('Specification created')'. The \
text in the references is derived from the definition and also \
rendered as hyperlink to the definition."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn44131"

RPM_NAME = "texlive-refenums-2023.201.1.1.2svn44131-53.1.noarch.rpm"
RPM_HASH = "cef1773c0a30242a73d267fa9a75bb52e2f8bcf58a6d2eb4b882847b3caedd25e7305c93c000ece770245e30aca676a6203c15b2f1112c6d1c1f6a6feface7f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(refenums.sty) texlive-refenums"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(cleveref.sty) tex(csquotes.sty) tex(hyperref.sty) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
