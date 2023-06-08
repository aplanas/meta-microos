SUMMARY = "Multiple choice questionnaires in two column tables"
DESCRIPTION = "The alterqcm package is a LaTeX2e package, for making multiple \
choices questionnaires in a table with two columns. The aim is \
to provide some useful macros to build QCM in tables. These \
macros may be used by only LaTeX TeX users. The package works \
with utf8, pdfLaTeX, LuaLaTeX and XeLaTeX (with some \
languages). The documentation is in English."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.42csvn59265"

RPM_NAME = "texlive-alterqcm-2023.201.4.42csvn59265-54.1.noarch.rpm"
RPM_HASH = "0cf2e85243d6f43d9c0a202b64786961a2a8656c2f1531a2cbddd181ccd7c3a1a47528c7a607b997a3b0b2298060737aebc9f6c5b7e6daa40046a5ab8fa48c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(alterqcm.sty) texlive-alterqcm"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(calc.sty) tex(ifthen.sty) tex(multirow.sty) tex(pifont.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
