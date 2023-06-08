SUMMARY = "Macros for lua language"
DESCRIPTION = "RPM macros for lua packaging"
LICENSE = "MIT"

PV = "20210827"

RPM_NAME = "lua-macros-20210827-3.3.noarch.rpm"
RPM_HASH = "917528ca93decc0ce4ee9310de5d71fbd328b99c2e847f49c20fff3ec582954cd0c0d28f065a1569b92ea2ce1147b1edb4e5d204e9f25061414c3f2f931d8061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-macros rpm_macro(ifluadefault) rpm_macro(lua_archdir) rpm_macro(lua_incdir) rpm_macro(lua_noarchdir) rpm_macro(lua_provides) rpm_macro(lua_version) rpm_macro(lua_version_default) rpm_macro(lua_version_default_nodots) rpm_macro(lua_version_nodots) rpm_macro(luarocks_build) rpm_macro(luarocks_install) rpm_macro(luarocks_treedir)"
RDEPENDS:${PN} += "lua"

inherit rpm
