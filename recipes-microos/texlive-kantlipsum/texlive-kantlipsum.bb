SUMMARY = "Generate sentences in Kant's style"
DESCRIPTION = "The package spits out sentences in Kantian style; the text is \
provided by the Kant generator for Python by Mark Pilgrim, \
described in the book 'Dive into Python'. The package is \
modelled on lipsum, and may be used for similar purposes."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8asvn51727"

RPM_NAME = "texlive-kantlipsum-2023.201.0.0.8asvn51727-55.1.noarch.rpm"
RPM_HASH = "bcf094abfc815455e1d186cd7452c18389a726ccd0f3972abc2950d61ad5245d867de259428b67fc3acf23e51e6900636e0b2a665b1ae9b35e7deecefd61cbbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(kantlipsum.sty) \
texlive-kantlipsum"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
