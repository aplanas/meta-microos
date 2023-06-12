SUMMARY = "Multilingual index processor"
DESCRIPTION = "The package is a multilingual index processor with the \
following features: Mostly compatible with makeindex and upper \
compatible with mendex. Supports UTF-8 and works with upLaTeX, \
XeLaTeX and LuaLaTeX. Supports Latin (including non-English), \
Greek, Cyrillic, Korean Hangul and Chinese Han (Hanzi \
ideographs) scripts, as well as Japanese Kana. Supports \
Devanagari, Thai, Arabic and Hebrew scripts (experimental). \
Supports four kinds of sort orders (Pinyin, Radical-Stroke, \
Stroke and Zhuyin) for Chinese Han scripts (Hanzi ideographs). \
Applies International Components for Unicode (ICU) for sorting \
process."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.07svn66381"

RPM_NAME = "texlive-upmendex-2023.201.1.07svn66381-53.1.noarch.rpm"
RPM_HASH = "dbce8e07d632e4e77d79c8cb16141edd754160f82dd840c3b0bb54859b66bd80269b61e7aab6a17c8ce6d150d4122c22780c52ec8cf84241911ccc2d828cb8fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(upmendex.1) \
texlive-upmendex"
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
texlive-scripts-bin \
texlive-upmendex-bin"

inherit rpm
