SUMMARY = "Documentation for texlive-lua-alt-getopt"
DESCRIPTION = "This package includes the documentation for texlive-lua-alt-getopt"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.0svn56414"

RPM_NAME = "texlive-lua-alt-getopt-doc-2023.201.0.0.7.0svn56414-52.1.noarch.rpm"
RPM_HASH = "1ab3bdccc252680699c391cd96eb691977c264994d3cabdcc9ca97d9fee58372723b62f7b75737e156270aa8400191517c91f32355c8ba367113c13201d1727c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-alt-getopt-doc"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua"

inherit rpm
