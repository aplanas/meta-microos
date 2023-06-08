SUMMARY = "Process application arguments the same way as getopt_long"
DESCRIPTION = "lua_altgetopt is a MIT-licensed module for Lua, for processing \
application arguments in the same way as BSD/GNU getopt_long(3) \
functions do. This module is made available for lua script \
writers to have consistent command line parsing routines."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.0svn56414"

RPM_NAME = "texlive-lua-alt-getopt-2023.201.0.0.7.0svn56414-52.1.noarch.rpm"
RPM_HASH = "e0cbaac29af482f3bf105fc474ddb2669a59096781691ec05f35d45b4a953badd5320c1b673bd1a3607d331f0bdcf81462583ca6dcf59913bf0c2e0e2fa1afd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-alt-getopt"
RDEPENDS:${PN} += "/bin/sh /usr/bin/luatex coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
