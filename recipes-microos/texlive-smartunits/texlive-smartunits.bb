SUMMARY = "Converting between common metric and Imperial units"
DESCRIPTION = "This LaTeX package implements a \\SmartUnit macro for converting \
between (some) metric and Imperial units. The package requires \
pgfkeys and siunitx."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn39592"

RPM_NAME = "texlive-smartunits-2023.201.1.2svn39592-57.1.noarch.rpm"
RPM_HASH = "feab7d67e47b27cf20fa40cd5d51209a089a0bed065704618e88f6d2451823f392eacb175686f25fe0df07264d92aa2f815616d0b9b8e39866abd291612a6c01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(smartunits.sty) \
texlive-smartunits"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pgfkeys.sty) \
tex(pgfmath.sty) \
tex(siunitx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
