SUMMARY = "Integrating notes into the bibliography"
DESCRIPTION = "The package defines a new type of note, bibnote, which will \
always be added to the bibliography. The package allows \
footnotes and endnotes to be moved into the bibliography in the \
same way. The package can be used with natbib and BibLaTeX as \
well as plain LaTeX citations. Both sorted and unsorted \
bibliography styles are supported. The package uses the LaTeX 3 \
macros and the associated xpackages bundle. It also makes use \
of the e-TeX extensions (any post-2005 LaTeX distribution will \
provide these by default, but users of older systems may need \
to use an elatex command or equivalent). The package relies on \
LaTeX 3 support from the l3kernel and l3packages bundles."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0msvn52231"

RPM_NAME = "texlive-notes2bib-2023.201.2.0msvn52231-54.1.noarch.rpm"
RPM_HASH = "70566b150afef1ad267cf9cdc0e90d9959ebc0c48455bd5ec379b0ea96e1b8466bc0dd689b445ac41515116b67b2f752726539854ac45bb8f0f70d88e0420227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(notes2bib.sty) texlive-notes2bib"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(l3keys2e.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
