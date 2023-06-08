SUMMARY = "Create randomized Multiple Choice questions"
DESCRIPTION = "This LaTeX package automatically randomly permutes the order of \
questions as well as the answer options in different versions \
of a multiple choice exam/test. Next to the exam versions \
themselves, the package also allows printing a concept version \
of the exam, a key table with the correct answers or points, \
and a document with solutions and explanations per exam \
version. The package also allows writing an R code which \
processes the results of the exam and calculates the grades. \
The following other LaTeX packages are required: enumitem, \
environ, etoolbox, longtable, newfile, pgffor (from the \
PGF/TikZ bundle), xkeyval, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn60481"

RPM_NAME = "texlive-mcexam-2023.201.0.0.5svn60481-52.1.noarch.rpm"
RPM_HASH = "8ad3a7399286022816199ff9f2a2fa90a55e74afef49a1ddc96c045ecff4bea24e6879364c26103a13ea647c9d48da143cdc2956b3c1be38f1f2966f2f9855a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mcexam.sty) texlive-mcexam"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(enumitem.sty) tex(environ.sty) tex(etoolbox.sty) tex(longtable.sty) tex(newfile.sty) tex(pgffor.sty) tex(xkeyval.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
