SUMMARY = "Control the behaviour of '_' in text"
DESCRIPTION = "With the package, \\_ in text mode (i.e., \\textunderscore) \
prints an underscore so that hyphenation of words either side \
of it is not affected; a package option controls whether an \
actual hyphenation point appears after the underscore, or \
merely a break point. The package also arranges that, while in \
text, '_' itself behaves as \\textunderscore (the behaviour of _ \
in maths mode is not affected)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18261"

RPM_NAME = "texlive-underscore-2023.201.svn18261-53.1.noarch.rpm"
RPM_HASH = "e5a867b90a3965152a4a1cb4a972f6169803cef7493ac1973e4f4149ee67d168ba9fc2c268f4acf5b2e0116c97f3637f59c6d0d3215c43bb267609b8e361eb5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(underscore.sty) \
texlive-underscore"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(chicago.sty) \
tex(fontenc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
