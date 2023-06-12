SUMMARY = "Always keep upright shape for some punctuation marks and Arabic numerals"
DESCRIPTION = "The package provides a mechanism to keep punctuation always in \
upright shape even if italic was specified. It is directed to \
Latin Modern fonts, and provides .tfm, .vf, .fd, and .sty \
files. Here a list of punctuation characters always presented \
in upright shapes: comma, period, semicolon, colon, \
parentheses, square brackets, and Arabic numerals."
LICENSE = "LPPL-1.3c"

PV = "2023.201.0.0.1svn42334"

RPM_NAME = "texlive-uppunctlm-2023.201.0.0.1svn42334-53.1.noarch.rpm"
RPM_HASH = "94e327885e61cccbb56ad00925c949aae9b08cc169085bb79cebff31e93b446f600840a9ed3e8e262013f5162407910a4d95e0e2395393179cef74062db63d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ec-uplmri10.tfm) \
tex(ec-uplmri10.vf) \
tex(ec-uplmri12.tfm) \
tex(ec-uplmri12.vf) \
tex(ec-uplmri7.tfm) \
tex(ec-uplmri7.vf) \
tex(ec-uplmri8.tfm) \
tex(ec-uplmri8.vf) \
tex(ec-uplmri9.tfm) \
tex(ec-uplmri9.vf) \
tex(t1uplmr.fd) \
tex(uppunctlm.sty) \
texlive-uppunctlm"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ec-lmr10.tfm) \
tex(ec-lmr12.tfm) \
tex(ec-lmr7.tfm) \
tex(ec-lmr8.tfm) \
tex(ec-lmr9.tfm) \
tex(ec-lmri10.tfm) \
tex(ec-lmri12.tfm) \
tex(ec-lmri7.tfm) \
tex(ec-lmri8.tfm) \
tex(ec-lmri9.tfm) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
