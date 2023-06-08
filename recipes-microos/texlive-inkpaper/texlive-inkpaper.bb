SUMMARY = "A mathematical paper template"
DESCRIPTION = "InkPaper is designed to write mathematical papers,especially \
designed for Mathematics Students. ZJGS students. magazine \
editors. NOTICE.This is not a Thesis class."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-inkpaper-2023.201.1.0svn54080-52.1.noarch.rpm"
RPM_HASH = "2acf4c297421cfc8fe40260955ebaaf00ffcba529019dea12adbb762f91be45d4284f4a78ea705c4994dd3119231ba2b55c9b7d8a434d22056ff6b473189009f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(inkpaper.cls) texlive-inkpaper"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(abstract.sty) tex(amsfonts.sty) tex(amsthm.sty) tex(asymptote.sty) tex(calc.sty) tex(cite.sty) tex(ctexart.cls) tex(etoolbox.sty) tex(fancyhdr.sty) tex(hyperref.sty) tex(ifthen.sty) tex(ifxetex.sty) tex(kvoptions.sty) tex(listings.sty) tex(mfirstuc.sty) tex(microtype.sty) tex(newtxmath.sty) tex(newtxtext.sty) tex(siunitx.sty) tex(textcase.sty) tex(xcolor.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
