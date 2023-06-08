SUMMARY = "Storing information for reuse"
DESCRIPTION = "The package provides 'store boxes' whose user interface matches \
that of normal LaTeX 'save boxes', except that the content of a \
store box appears at most once in the output PDF file, however \
often it is used. The present version of the package supports \
pdfLaTeX and LuaLaTeX; when DVI is output, store boxes behave \
the same as save boxes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn64967"

RPM_NAME = "texlive-storebox-2023.201.1.3asvn64967-57.1.noarch.rpm"
RPM_HASH = "534faa350bf95534d7815ea3b857ef581ec989a9cc0fd69ef1539402c995c3d4d4aa6131149df6d219a96609629cec1884b71aad1746cad4ad68a56cab3ca704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(storebox-pgf.sty) tex(storebox.sty) texlive-storebox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(collectbox.sty) tex(ifpdf.sty) tex(pgf.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
