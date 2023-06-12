SUMMARY = "Babel support for English"
DESCRIPTION = "The package provides the language definition file for support \
of English in babel. Care is taken to select british \
hyphenation patterns for British English and Australian text, \
and default ('american') patterns for Canadian and USA text."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.3rsvn44495"

RPM_NAME = "texlive-babel-english-2023.201.3.3rsvn44495-53.1.noarch.rpm"
RPM_HASH = "e2e56e91d71e9b55a849965d1e9d6cced3693e7b34e7b3f3f2ec62bc45be6c23487dd7bf3bd3331e6a027e44e51ee508351d0763a8c036dc181fc97d27acf41e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(UKenglish.ldf) \
tex(USenglish.ldf) \
tex(american.ldf) \
tex(australian.ldf) \
tex(british.ldf) \
tex(canadian.ldf) \
tex(english.ldf) \
tex(newzealand.ldf) \
texlive-babel-english"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
