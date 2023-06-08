SUMMARY = "MessagePack is an efficient binary serialization format"
DESCRIPTION = "MessagePack is an efficient binary serialization format. \
It lets you exchange data among multiple languages like JSON but it's faster and \
smaller. \
It's a pure Lua implementation, without dependency. \
And it's really fast with LuaJIT."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "lua51-messagepack-0.5.2-2.1.noarch.rpm"
RPM_HASH = "1b321984f0e2698ac5408d961b7aa64cec485944d2d702ab48f94692b0ec9ba87940511fc23e2aa382d0a1e19192e15a289f3d6b3e6131a48faef51bac0d1059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-messagepack"
RDEPENDS:${PN} += "lua51"

inherit rpm
