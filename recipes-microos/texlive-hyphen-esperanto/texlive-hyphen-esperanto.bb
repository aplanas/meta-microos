SUMMARY = "Esperanto hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Esperanto ISO Latin 3 and UTF-8 \
encodings. Note that TeX distributions don't ship any suitable \
fonts in Latin 3 encoding, so unless you create your own font \
support or want to use MlTeX, using native Unicode engines is \
highly recommended."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-esperanto-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "c668a45409e6cc240b1ec920cb7280f20109f6e9a06652b2c91b0708aad20cc8603fea711015140f7b41e15ca5050ae7ffc9d759fa127dcf433f1aea75a3edd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-eo.il3.tex) tex(hyph-eo.tex) tex(loadhyph-eo.tex) texlive-hyphen-esperanto"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
