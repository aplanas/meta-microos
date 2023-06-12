SUMMARY = "Minimal scheme (plain only)"
DESCRIPTION = "This is the minimal TeX Live scheme, with support for only \
plain TeX. (No LaTeX macros.) LuaTeX is included because Lua \
scripts are used in TeX Live infrastructure. This scheme \
corresponds exactly to collection-basic."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54191"

RPM_NAME = "texlive-scheme-minimal-2023.208.svn54191-58.1.noarch.rpm"
RPM_HASH = "2b89db2b725b6cca7bacbfd97d5d634f2ae921de32d41946f2bf1962f361428207d23d0221e5bfb4727241ea0b7c4f50117ecbfff515d3b3098dd2bc5e908097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-minimal"
RDEPENDS:${PN} += "texlive-collection-basic"

inherit rpm
