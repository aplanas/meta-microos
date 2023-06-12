SUMMARY = "Macros to change text and mathematics fonts in plain XeTeX"
DESCRIPTION = "This package consists of macros that can be used to typeset \
'plain' XeTeX documents using any OpenType or TrueType font \
installed on the computer system. The macros allow the user to \
change the text mode fonts and some math mode fonts. For any \
declared font family, various font style, weight, and size \
variants like bold, italics, small caps, etc., are available \
through standard and custom TeX control statements. Using the \
optional argument of the macros, the available XeTeX font \
features and OpenType tags can be accessed. Other features of \
the package include activating and deactivating hanging \
punctuation, and support for special Unicode characters."
LICENSE = "LPPL-1.0"

PV = "2023.201.2016.1svn40404"

RPM_NAME = "texlive-font-change-xetex-2023.201.2016.1svn40404-52.1.noarch.rpm"
RPM_HASH = "147bec7daafcea4002aabee1c71b8b414822d7fa6dd8f33199367844374a392735262eb26124b7c23750caad05a9b79080904cdd6bf67053c6f4c4ce07fbd076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(font-change-xetex.tex) \
texlive-font-change-xetex"
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
