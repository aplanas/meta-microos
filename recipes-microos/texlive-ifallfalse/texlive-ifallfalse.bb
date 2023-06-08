SUMMARY = "Compare a string against a set of other strings"
DESCRIPTION = "This package allows you to check whether a string is contained \
within another set of strings, and perform an action if it is \
not. This is done by using the allfalse environment and passing \
in a string and an action to be performed if the string is not \
contained in the set. Then, passing in a string to the \\orcheck \
macro inside the respective allfalse environment adds that to \
the set of strings. This package does not work with the LuaTeX \
engine."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn60027"

RPM_NAME = "texlive-ifallfalse-2023.201.2.0.0svn60027-52.1.noarch.rpm"
RPM_HASH = "d5b4428c7bf6deb5ca69585df53efbea240a53fe4212b1c6b868641fac7fa75c9f22514a77f5aa8362934989914e49f97a260a094dfcc4ddc6b20976576727a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ifallfalse.sty) texlive-ifallfalse"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
