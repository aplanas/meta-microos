SUMMARY = "Persian (Farsi) introduction to LaTeX"
DESCRIPTION = "A Persian (Farsi) translation of Oetiker's (not so) short \
introduction."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.5.01svn31296"

RPM_NAME = "texlive-lshort-persian-2023.201.5.01svn31296-54.1.noarch.rpm"
RPM_HASH = "1e55233e97dbb8907df14653c5c5100293550b0e6878e9dfa7f1d3afaf13b8f1aa25edb77d0674a819ec2d3efa6a02a0e0378eb0ea3bdd48f9309ac8997a3e73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-persian"
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
