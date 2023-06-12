SUMMARY = "A Python library for creating LaTeX files and snippets"
DESCRIPTION = "PyLaTeX is a Python library for creating and compiling LaTeX files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python39-PyLaTeX-1.4.1-2.11.noarch.rpm"
RPM_HASH = "41a48e58c730f0dd6bd02cf07d1f5a30157b9804ee77a75bffd8a90fa799e8c566bdb28070b7f6ba79da85797185fd584aad1db06903c98a5b4becbd27e861a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pylatex) \
python39-PyLaTeX \
python3dist(pylatex)"
RDEPENDS:${PN} += "python(abi) \
python39-ordered-set \
texlive-latex"

inherit rpm
