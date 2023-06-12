SUMMARY = "Documentation for texlive-luaotfload"
DESCRIPTION = "This package includes the documentation for texlive-luaotfload"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.23svn64616"

RPM_NAME = "texlive-luaotfload-doc-2023.201.3.23svn64616-52.1.noarch.rpm"
RPM_HASH = "f720fbaaef7ec57ed01cadc9b2035cba77dceab45a69193468302888649661e1837ea4241c54353af7c13068e7fdf29181b6144b77e367379772e9152603dc38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(luaotfload-tool.1) \
texlive-luaotfload-doc"
RDEPENDS:${PN} += ""

inherit rpm
