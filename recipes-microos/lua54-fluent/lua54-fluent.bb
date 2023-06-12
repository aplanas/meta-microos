SUMMARY = "Lua implementation of Project Fluent"
DESCRIPTION = "A Lua implementation of Project Fluent, a localization paradigm designed \
to unleash the entire expressive power of natural language translations. \
Fluent is a family of localization specifications, implementations and \
good practices developed by Mozilla who extracted parts of their 'l20n' \
solution (used in Firefox and other apps) into a re-usable specification."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua54-fluent-0.2.0-2.1.noarch.rpm"
RPM_HASH = "ef445f887a24b8377b4a1a06c0d1704ad84cc8c129ee0b2cc5b84a0f8eeb289eb48dffe690cf3b1ac46e725da5aaf635374cd67f2529b709133cb86b421b25f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-fluent \
lua54-fluent"
RDEPENDS:${PN} += "lua54 \
lua54-cldr \
lua54-luaepnf \
lua54-penlight"

inherit rpm
