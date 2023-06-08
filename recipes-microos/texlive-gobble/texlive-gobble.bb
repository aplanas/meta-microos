SUMMARY = "More gobble macros for PlainTeX and LaTeX"
DESCRIPTION = "The LaTeX package gobble includes several gobble macros not \
included in the LaTeX kernel. These macros remove a number of \
arguments after them, a feature regulary used inside other \
macros. This includes gobble macros for optional arguments. The \
LaTeX package gobble-user provides these macros at the user \
level, i.e. using names without @ so that these can be used \
without \\makeatletter and \\makeatother. The same macros are \
provided inside .tex files for use with plain-TeX or other TeX \
formats. However, the gobble macros for optional macros require \
\\@ifnextchar to be defined."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn64967"

RPM_NAME = "texlive-gobble-2023.201.0.0.2svn64967-53.1.noarch.rpm"
RPM_HASH = "e8804c7a399ea886822d4b3edce731550ba16da7f9c89fb01fb4da79867374b20c726e1626ced59e9ff22720ea37e454fa9bffdeb6c6e35ed59e050eea15917f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gobble-user.sty) tex(gobble-user.tex) tex(gobble.sty) tex(gobble.tex) texlive-gobble"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
