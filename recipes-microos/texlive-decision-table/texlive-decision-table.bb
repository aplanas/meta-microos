SUMMARY = "An easy way to create Decision Model and Notation decision tables"
DESCRIPTION = "The decision-table package allows for an easy way to generate \
decision tables in the Decision Model and Notation (DMN) \
format. This package ensures consistency in the tables (i.e. \
fontsize), and is thus a better alternative to inserting tables \
via images. The decision-table package adds the \\dmntable \
command, with which tables can be created. This command expands \
into a tabular, so it can be used within a table or figure \
environment. Furthermore, this allows labels and captions to be \
added seamlessly. It is also possible to place multiple DMN \
tables in one table/figure environment. The package relies on \
nicematrix and l3keys2e."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.4svn60673"

RPM_NAME = "texlive-decision-table-2023.201.0.0.0.4svn60673-52.1.noarch.rpm"
RPM_HASH = "cf0e073e26e5de4862192668c1105b1329434ca0c959f217624375f07fed59b424a352cd56422bb6df88715dc5269096447fe14aa68c150979b653d2b1bd63ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(decision-table.sty) \
texlive-decision-table"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(l3keys2e.sty) \
tex(nicematrix.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
