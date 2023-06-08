SUMMARY = "Minimal scheme (plain only)"
DESCRIPTION = "This is the minimal TeX Live scheme, with support for only \
plain TeX. (No LaTeX macros.) LuaTeX is included because Lua \
scripts are used in TeX Live infrastructure. This scheme \
corresponds exactly to collection-basic."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54191"

RPM_NAME = "texlive-scheme-minimal-2023.201.svn54191-56.1.noarch.rpm"
RPM_HASH = "bc89ef219f4065d5f5467a860f5513874327df6ad92782c11ef6afe1e96854de9037fdbf20144ad2ac82c8681e9873e6fc012494fa1264c79709d00a1274fb7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-minimal"
RDEPENDS:${PN} += "texlive-collection-basic"

inherit rpm
