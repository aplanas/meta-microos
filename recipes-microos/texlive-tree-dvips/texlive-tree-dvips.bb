SUMMARY = "Trees and other linguists' macros"
DESCRIPTION = "The package defines a mechanism for specifying connected trees \
that uses a tabular environment to generate node positions. The \
package uses PostScript code, loaded by dvips, so output can \
only be generated by use of dvips. The package lingmacros.sty \
defines a few macros for linguists: \\enumsentence for \
enumerating sentence examples, simple tabular-based \
non-connected tree macros, and gloss macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn21751"

RPM_NAME = "texlive-tree-dvips-2023.201.0.0.91svn21751-52.1.noarch.rpm"
RPM_HASH = "1f6710b22b5c9cee9db0332641a506411b52d5538462706d4a542bc513f043d26470acd6061f4a43a9559fd4c0b7fc2c4828e79dfa97ba3c36c6a37fce4736ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lingmacros.sty) tex(tree-dvips.sty) texlive-tree-dvips"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
