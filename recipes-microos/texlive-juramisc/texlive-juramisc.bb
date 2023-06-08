SUMMARY = "Typesetting German juridical documents"
DESCRIPTION = "A collection of classes for typesetting court sentences, legal \
opinions, books and dissertations for German lawyers. A \
jurabook class is also provided, which may not yet be complete."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn15878"

RPM_NAME = "texlive-juramisc-2023.201.0.0.91svn15878-55.1.noarch.rpm"
RPM_HASH = "05c906a29fe2c4c35726b132f618582efab1e3ac07ae586d4030f9b45c86b249a51a1df935f2a9614a9299918e2409ef20cdada38454f521dbe83dca4cd69871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jbgoe.clo) tex(jbstgallen.clo) tex(jbtrier.clo) tex(jurabase.sty) tex(jurabook.cls) tex(juraovw.cls) tex(juraurtl.cls) texlive-juramisc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(book.cls) tex(calc.sty) tex(color.sty) tex(fancybox.sty) tex(fancyhdr.sty) tex(ifpdf.sty) tex(ifthen.sty) tex(multicol.sty) tex(pifont.sty) tex(ragged2e.sty) tex(remreset.sty) tex(scrartcl.cls) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
