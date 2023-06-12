SUMMARY = "Typesets long division"
DESCRIPTION = "This package executes the long division algorithm and typesets \
the solutions. The dividend must be a positive decimal number \
and the divisor must be a positive integer. Repeating decimals \
is handled correctly, putting a bar over the repeated part of \
the decimal. Dividends up to 20 digits long are handled \
gracefully (though the typeset result will take up about a \
page), and dividends between 20 and 60 digits long slightly \
less gracefully. The package defines two macros, \\longdivision \
and \\intlongdivision. Each takes two arguments, a dividend and \
a divisor. \\longdivision keeps dividing until the remainder is \
zero, or it encounters a repeated remainder. \\intlongdivision \
stops when the dividend stops (though the dividend doesn't have \
to be an integer). This package depends on the xparse package \
from the l3packages bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.1svn59979"

RPM_NAME = "texlive-longdivision-2023.201.1.2.1svn59979-54.1.noarch.rpm"
RPM_HASH = "7a240e1e4ce8a1b2a4208b93631268441ee54b0ef32303bafa77e5fd26527c7ea2c038ad965eaf0f7b6bd969f15ac6502b6e04e8fc7e16e424439ebd8bd42c12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(longdivision.sty) \
texlive-longdivision"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
