SUMMARY = "Typesetting Ecclesiastic Latin"
DESCRIPTION = "The package modifies the way the latin option to babel operates \
when typesetting Latin. The style is somewhat 'frenchified' in \
respect of punctuation spacings and footnote style; shortcuts \
are available in order to set accents on all vowels, including \
y and the diphthongs ae and oe."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn38172"

RPM_NAME = "texlive-ecclesiastic-2023.201.0.0.3svn38172-53.1.noarch.rpm"
RPM_HASH = "03d2f9de378f611fae50cf25875a620b028e2c5b2880fc7624c293b1fc53305b0a71d0c2905cb34a0b663e135b729d85c78c85434d9a1aeaffe170fd24f16024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ecclesiastic.sty) texlive-ecclesiastic"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(iftex.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
