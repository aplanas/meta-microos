SUMMARY = "Logarithms and powers with (almost) 9 digits"
DESCRIPTION = "This small package (usable with Plain e-TeX, LaTeX, or others) \
with no dependencies provides two fast expandable macros \
computing logarithms in base 10 and fractional powers of 10. \
They handle arguments of 9 digit tokens which stand for either \
1 <= d.dddddddd < 10 (for the log) or 0.xxxxxxxxx (for powers \
of 10). They achieve a precision of 1ulp for the logarithm and \
2ulp for fractional powers of ten. Extension to other numerical \
ranges has to be done by user, via own macros or some math \
engine. The xintexpr package (at 1.3f) imports the poormanlog \
macros as core constituents of its log10(), pow10(), log(), \
exp() and pow() functions."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.07svn63400"

RPM_NAME = "texlive-poormanlog-2023.201.0.0.07svn63400-52.1.noarch.rpm"
RPM_HASH = "89d931350dbf714d5e1843f21bc7cb47204ddffa852cfd3cf164e59d18bdffc41fb89f6b6bf323027c660262ced3ea2727a8ac443bfe5f39079dbf36ad3f4161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(poormanlog.sty) \
tex(poormanlog.tex) \
texlive-poormanlog"
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
