SUMMARY = "LaTeX to HTML Converter"
DESCRIPTION = "LaTeX2HTML lets you convert basic LaTeX documents into the HTML \
format. This allows both a written and online version even of older \
LaTeX texts."
LICENSE = "GPL-2.0-or-later"

PV = "2023"

RPM_NAME = "latex2html-2023-1.2.noarch.rpm"
RPM_HASH = "2e44b50dcddcca39ab62d65880ea71d7491945c6b2b46322953ad8ecc9e1920f6a87ccb341667c0cd23f718b97ede7a9f4366a9c503da4c2515005152abdf020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latex2html \
perl(L2hos) \
perl(L2hos::Dos) \
perl(L2hos::Mac) \
perl(L2hos::OS2) \
perl(L2hos::Unix) \
perl(L2hos::Win32) \
perl(cfgcache)"
RDEPENDS:${PN} += "/usr/bin/perl \
ghostscript_any \
latex2html-pngicons \
netpbm \
perl \
texlive-dvips \
texlive-latex \
texlive-preview"

inherit rpm
