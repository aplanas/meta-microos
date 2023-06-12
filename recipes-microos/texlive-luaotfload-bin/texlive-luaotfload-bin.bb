SUMMARY = "Binary files of luaotfload"
DESCRIPTION = "Binary files of luaotfload"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34647"

RPM_NAME = "texlive-luaotfload-bin-2023.20230311.svn34647-91.1.aarch64.rpm"
RPM_HASH = "aae0ab6d3e68ba851f7177ec9f3bf6bef72b8f22a5039fba804410f20685406f1f96f9bbb2997c34b9880eb7b6381f4966417b25b217e2ddd0ca3ef19ee850cf"

RPROVIDES:${PN} += "texlive-luaotfload-bin texlive-luaotfload-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-luaotfload"

inherit rpm
