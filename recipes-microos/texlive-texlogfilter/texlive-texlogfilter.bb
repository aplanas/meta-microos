SUMMARY = "Filter LaTeX engines output or log file"
DESCRIPTION = "texlogfilter is a Perl script designed to filter LaTeX engines \
output or log file (LaTeX, pdfLaTeX, LuaLaTeX or XeLaTeX). It \
reduces the LaTeX output or log to keep only warnings and \
errors. The result is colorised. Options allow to mask specific \
warnings, such as box or references/citations warnings. It's \
also possible to add custom filter patterns."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn62792"

RPM_NAME = "texlive-texlogfilter-2023.201.1.1svn62792-54.1.noarch.rpm"
RPM_HASH = "be43ae724231480ed83d45075626a050e097e7ffe9d15308feb1a4137164e0f34c1b3d7656e6d1f8ce70c56deba61d33e9a81bda5c082c88f92b68e5b1df9116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlogfilter"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep perl(Getopt::Long) perl(Term::ANSIColor) perl(strict) perl(warnings) sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-texlogfilter-bin"

inherit rpm
