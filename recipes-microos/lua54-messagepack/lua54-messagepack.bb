SUMMARY = "MessagePack is an efficient binary serialization format"
DESCRIPTION = "MessagePack is an efficient binary serialization format. \
It lets you exchange data among multiple languages like JSON but it's faster and \
smaller. \
It's a pure Lua implementation, without dependency. \
And it's really fast with LuaJIT."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "lua54-messagepack-0.5.2-2.1.noarch.rpm"
RPM_HASH = "a22e274951ad76b42868895220150bae9d12691548f952745208e693b803745667a41e3f54e09fdc61b955630c035470d53e2cfc0be4332772c40b625560ec94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-MessagePack lua-messagepack lua54-messagepack"
RDEPENDS:${PN} += "lua54"

inherit rpm
