SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "This package includes the luatex development files. \
LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "texlive-texlua-devel-5.3.6-91.1.aarch64.rpm"
RPM_HASH = "b1c9bd97ce7ad0603583c2283489dcfafa3878b0580b5b870a3be161cacc0e2884b4d7a14d998d3aace2c9aae2a9a37c445dac4b08d3d8ac26ba21280845b8d1"

RPROVIDES:${PN} += "pkgconfig(texlua53) texlive-texlua-devel texlive-texlua-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtexlua53-5"

inherit rpm
