SUMMARY = "Create CJK character calligraphy practicing sheets"
DESCRIPTION = "This is a LaTeX package for creating CJK character calligraphy \
practicing sheets (copybooks). Currently, only XeTeX is \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn60676"

RPM_NAME = "texlive-zitie-2023.201.1.4.0svn60676-52.1.noarch.rpm"
RPM_HASH = "016b2a244529c227804f14e1e2942b5dbbcec34c04af1605c3b07e93be9f816231911f71eae32ce71073dfe3b03b1afd094eb823c0eb7ba6a216db48aa0e8d1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(zitie.luatex.def) tex(zitie.sty) tex(zitie.xetex.def) texlive-zitie"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ctex.sty) tex(l3draw.sty) tex(l3keys2e.sty) tex(xeCJK.sty) tex(xparse.sty) tex(zhlipsum.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
