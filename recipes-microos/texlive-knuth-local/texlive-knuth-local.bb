SUMMARY = "Knuth's local information"
DESCRIPTION = "A collection of experimental programs and developments based \
on, or complementary to, the matter in his distribution \
directories."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn57963"

RPM_NAME = "texlive-knuth-local-2023.201.svn57963-55.1.noarch.rpm"
RPM_HASH = "3858b98174d8d3650a018b71cbf2cbf5675005052dc970b3daf5a4c2c598c972e9ef32ab6d9509a3336ffa8d2654dd3f5c3cb3f3334c348b0d2d075e74f887eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(domino.tfm) \
tex(logod10.tfm) \
tex(logosl9.tfm) \
tex(random.tfm) \
tex(snfont.tfm) \
tex(xepsf.tex) \
texlive-knuth-local"
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
