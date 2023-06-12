SUMMARY = "Environments for writing optimization problems"
DESCRIPTION = "This small library provides a standard set of environments for \
writing optimization problems. It automatically aligns the \
problems in three points with an optional fourth: Beginning of \
the words 'minimize/argmin' and 'subject to' The objective \
function and the longest left hand side of the constraints. The \
$= | > | <$ signs of the constraints. Optionally, the user can \
add manually a double align character && to align some common \
constraints feature. A clear example could be the constraints \
names, e.g. (boundary constraint) alignment with (dynamic \
constraint). Furthermore, it provides an easy interface to \
define optimization problem for three different reference \
situations: Where no equation is referenced/numbered. Where the \
problem is referenced with a single number. Where each equation \
has an individual reference. Finally, it also allows a \
definition of any optimization problem without a limitless \
number of constraints."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn50941"

RPM_NAME = "texlive-optidef-2023.201.3.1svn50941-54.1.noarch.rpm"
RPM_HASH = "0f58414fb09d33093dbc597d25c170c8548005285fb843e60e3a502fde0bb15aad25790b2a56980625943d2fcd553b76f3522552226e93e4c257c06276eaab15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(optidef.sty) \
texlive-optidef"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(mathtools.sty) \
tex(xifthen.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
