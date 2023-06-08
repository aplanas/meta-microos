SUMMARY = "Converting a string between different encodings"
DESCRIPTION = "This package provides \\StringEncodingConvert for converting a \
string between different encodings. Both LaTeX and plain-TeX \
are supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn52982"

RPM_NAME = "texlive-stringenc-2023.201.1.12svn52982-57.1.noarch.rpm"
RPM_HASH = "d2b4cd085f864d6f4260ca82b7ca58c70052cb0ee92babf8947902455522acd254f2b944e99a1bba0d05086788073497bbdd70cfb2ab3c79daf7cc7acf6999a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(se-ascii-print.def) tex(se-ascii.def) tex(se-clean7bit.def) tex(se-cp1250.def) tex(se-cp1251.def) tex(se-cp1252.def) tex(se-cp1257.def) tex(se-cp437.def) tex(se-cp850.def) tex(se-cp852.def) tex(se-cp855.def) tex(se-cp858.def) tex(se-cp865.def) tex(se-cp866.def) tex(se-dec-mcs.def) tex(se-iso-8859-1.def) tex(se-iso-8859-10.def) tex(se-iso-8859-11.def) tex(se-iso-8859-13.def) tex(se-iso-8859-14.def) tex(se-iso-8859-15.def) tex(se-iso-8859-16.def) tex(se-iso-8859-2.def) tex(se-iso-8859-3.def) tex(se-iso-8859-4.def) tex(se-iso-8859-5.def) tex(se-iso-8859-6.def) tex(se-iso-8859-7.def) tex(se-iso-8859-8.def) tex(se-iso-8859-9.def) tex(se-koi8-r.def) tex(se-mac-centeuro.def) tex(se-mac-cyrillic.def) tex(se-mac-roman.def) tex(se-nextstep.def) tex(se-pdfdoc.def) tex(se-utf16le.def) tex(se-utf32be.def) tex(se-utf32le.def) tex(se-utf8.def) tex(stringenc.sty) texlive-stringenc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(infwarerr.sty) tex(ltxcmds.sty) tex(pdfescape.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
