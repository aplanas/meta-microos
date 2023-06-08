SUMMARY = "OpenType Unicode text and maths fonts"
DESCRIPTION = "The Scientific and Technical Information eXchange (STIX) fonts \
are intended to satisfy the demanding needs of authors, \
publishers, printers, and others working in the scientific, \
medical, and technical fields. They combine a comprehensive \
Unicode-based collection of mathematical symbols and alphabets \
with a set of text faces suitable for professional publishing. \
The fonts are available royalty-free under the SIL Open Font \
License."
LICENSE = "OFL-1.1"

PV = "2023.201.2.12svn58735"

RPM_NAME = "texlive-stix2-otf-2023.201.2.12svn58735-57.1.noarch.rpm"
RPM_HASH = "cd4275e1ad3420ecede3cb86b2f05490712668e67dd1033766f98689b6a735c2bb8aaf8f58292ce4c231819ef71e175882a8e52b59af41014859b2796bcf453d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix2-otf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-stix2-otf-fonts"

inherit rpm
