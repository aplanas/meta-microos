SUMMARY = "Loading patterns in LuaLaTeX with language.dat"
DESCRIPTION = "Preloading hyphenation patterns (or 'hyphen rules.) into any \
format based upon LuaTeX is not required in LuaTeX and recent \
releases of babel don't do it anyway. This package is addressed \
to those who just want to select the languages and load their \
patterns by means of `language.dat` without loading `babel`."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56200"

RPM_NAME = "texlive-luahyphenrules-2023.201.1.1svn56200-52.1.noarch.rpm"
RPM_HASH = "24f111ef6170b02fd46bf9f9d606c268a7312bd2c93a1577729afaf5aa3f3b6e66303d93e1f6837c58b36783187d75dc3e3ce37f7e266a03cad6d2607b414459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luahyphenrules.sty) texlive-luahyphenrules"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
