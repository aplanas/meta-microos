SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "This package includes the luatex development files. \
LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "texlive-texlua-devel-5.3.6-89.1.aarch64.rpm"
RPM_HASH = "c15e5914a7d358e9c9c266e4160f8784f3c0a445898a99a9f07939de0e91724993787c600f4e86dcb9d7921bdceaaa21cac65a8a9c81eb6ee9d6f22b25990bba"

RPROVIDES:${PN} += "pkgconfig(texlua53) texlive-texlua-devel texlive-texlua-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtexlua53-5"

inherit rpm
