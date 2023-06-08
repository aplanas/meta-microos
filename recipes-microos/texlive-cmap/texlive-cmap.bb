SUMMARY = "Make PDF files searchable and copyable"
DESCRIPTION = "The cmap package provides character map tables, which make PDF \
files generated by pdfLaTeX both searchable and copy-able in \
acrobat reader and other compliant PDF viewers. Encodings \
supported are OT1, OT6, T1, T2A, T2B, T2C and T5, together with \
LAE (Arabic), LFE (Farsi) and LGR (Greek) and a variant OT1tt \
for cmtt-like fonts. The package's main limitation currently is \
the inability to work with virtual fonts, because of \
limitations of pdfTeX. This restriction may be resolved in a \
future version of pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0jsvn57640"

RPM_NAME = "texlive-cmap-2023.201.1.0jsvn57640-53.1.noarch.rpm"
RPM_HASH = "4656507f4c641a90389c80e819f42f9f0133725604f1b68569a9e35e40c4dc243fbd6d58d6d70506a85519f4929ffe7dcdf208399f0d117ed7f8adc68672b59f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmap.sty) texlive-cmap"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
