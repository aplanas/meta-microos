SUMMARY = "LuaDoc-compatible documentation generation system"
DESCRIPTION = "LDoc is a LuaDoc-compatible documentation generator which can \
also process C extension source. Markdown may be optionally used \
to render comments, as well as integrated readme documentation \
and pretty-printed example files."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "lua54-ldoc-1.4.6-6.2.noarch.rpm"
RPM_HASH = "92e15d5729197f9e897112df20c4716d14d8a9c1dbb0f07825edc31b7531db170a3f4746e943b0d584bc406b57adf8cb4963aa65b05b7e574fb88ee5eb5a4033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-ldoc lua54-ldoc"
RDEPENDS:${PN} += "lua54"

inherit rpm
