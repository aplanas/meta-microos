SUMMARY = "Am I running under pdfTeX, XeTeX or LuaTeX?"
DESCRIPTION = "The package, which works both for Plain TeX and for LaTeX, \
defines the \\ifPDFTeX, \\ifXeTeX, and \\ifLuaTeX conditionals for \
testing which engine is being used for typesetting. The package \
also provides the \\RequirePDFTeX, \\RequireXeTeX, and \
\\RequireLuaTeX commands which throw an error if pdfTeX, XeTeX \
or LuaTeX (respectively) is not the engine in use."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0fsvn61910"

RPM_NAME = "texlive-iftex-2023.201.1.0fsvn61910-52.1.noarch.rpm"
RPM_HASH = "6d2cf5291eacef84f80d772f3f75d2a0e923971142bab398be8a9829ec703f7d69892ef3c7e8a53216c4d8eeeb0c6452878d984e131ffe07dda088e9b26eb3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ifetex.sty) tex(ifluatex.sty) tex(ifpdf.sty) tex(iftex.sty) tex(ifvtex.sty) tex(ifxetex.sty) texlive-iftex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
