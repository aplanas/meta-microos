SUMMARY = "Typeset matrices and arrays with spaces and semicolons as delimiters"
DESCRIPTION = "Typeset matrices and arrays with spaces and semicolons as \
delimiters. The purpose of this package is to decrease the \
number of keystrokes needed to typeset small amounts of aligned \
material (matrices, arrays, etc.). It provides a facility for \
typing alignment environments and macros with spaces as the \
alignment delimiter and semicolons (by default) as the \
end-of-row indicator. For instance, typeset a matrix using \
\\spalignmat{1 12 -3; 24 -2 2; 0 0 1}, or a vector using \
\\spalignvector{22 \\frac{1}{2} -14}. This package also contains \
utility macros for typesetting augmented matrices, vectors, \
arrays, systems of equations, and more, and is easily \
extendable to other situations that use alignments. People who \
have to typeset a large number of matrices (like linear algebra \
teachers) should find this package to be a real time saver."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42225"

RPM_NAME = "texlive-spalign-2023.201.svn42225-57.1.noarch.rpm"
RPM_HASH = "b500f1d67da0f1966bef3407af3eaa5facfde76093eeff89f75bf43b125ba95169fb0ca16bafe0f46fe8892de348a49664e6fdde5ee355e668350b243b6d65e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(spalign.sty) texlive-spalign"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(kvoptions.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
