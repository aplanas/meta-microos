SUMMARY = "Calculate the age of something, in years"
DESCRIPTION = "The package calculates the age of someone or something in \
years. Internally it uses the datenumber package to calculate \
the age in days; conversion from days to years is then \
performed, taking care of leap years and such odd things."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.90svn27725"

RPM_NAME = "texlive-calcage-2023.201.0.0.90svn27725-52.1.noarch.rpm"
RPM_HASH = "4ce5a1209f5f96cc311f09da0d9b7714236f00777576b44f7e7ae5b6d92e2f92832dd6d4b1d8d5430dba91a2b24a6561fd143aad7369388a6958c083b5b7fac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(calcage.sty) \
texlive-calcage"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fnumprint.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
