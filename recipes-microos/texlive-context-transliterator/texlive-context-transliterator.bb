SUMMARY = "Transliterate text from 'other' alphabets"
DESCRIPTION = "The package will read text in one alphabet, and provide a \
transliterated version in another; this is useful for readers \
who cannot read the original alphabet. The package can make \
allowance for hyphenation."
LICENSE = "BSD-3-Clause"

PV = "2023.204.svn61127"

RPM_NAME = "texlive-context-transliterator-2023.204.svn61127-54.1.noarch.rpm"
RPM_HASH = "bc0a896bda3974f268bfad08c9ded351c34cd2a0eca924576667d0c20594b66eedaee905102a2d66de18e39baaf41de078e99441d7f0ec2ce6502bfbf141ef9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(t-transliterator.tex) texlive-context-transliterator"
RDEPENDS:${PN} += "/bin/sh /usr/bin/texlua coreutils ed findutils grep sed texlive texlive-context texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
