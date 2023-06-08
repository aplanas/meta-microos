SUMMARY = "An OpenType Devanagari font designed for scholars"
DESCRIPTION = "This package provides a free, open source, Unicode compliant, \
OpenType font with support for Devanagari, Latin, and Cyrillic \
scripts. It is available in two weights--regular and bold. The \
font is designed with over 1600 Devanagari glyphs, including \
support for over 1100 conjunct consonants, as well as vedic \
accents. The Latin component of the font not only supports a \
wide range of characters required for Roman transliteration of \
Sanskrit, but also provides a subset of regularly used \
mathematical symbols for scholars working with scientific and \
technical documents. The project has been launched under the \
auspices of the Science and Heritage Initiative (SandHI) at IIT \
Bombay, and builds upon the following two fonts for its \
Devanagari and Latin components respectively: (i) Yashomudra by \
Rajya Marathi Vikas Samstha, and (ii) PT Serif by ParaType. We \
would like to thank both these organisations for releasing \
their fonts under the SIL Open Font Licence, which has enabled \
us to create Shobhika."
LICENSE = "OFL-1.1"

PV = "2023.201.1.05svn50555"

RPM_NAME = "texlive-shobhika-2023.201.1.05svn50555-53.1.noarch.rpm"
RPM_HASH = "7626d8aa731c87459ba78420fb00e88202b0eca322b2bf88b102b05379b66274ec5920ca823b95d1a18b0e23f75bac846c4fe3a35a7e874aa1f0e738d99013ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shobhika"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-shobhika-fonts"

inherit rpm
