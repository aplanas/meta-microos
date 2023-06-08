SUMMARY = "A programmer friendly language that compiles to Lua"
DESCRIPTION = "A programmer friendly language that compiles to Lua."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "lua51-moonscript-0.5.0-4.2.noarch.rpm"
RPM_HASH = "460dcbccd698048d22721f4f4e88c43f0b2596da74ea8baf972b59599285fbe38b8a29baf84f729eab5ac4929286d543cbcdffcb880f60404345f308ba5da07b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-moonscript"
RDEPENDS:${PN} += "/bin/sh /usr/bin/lua5.1 lua51 lua51-alt-getopt lua51-argparse lua51-loadkit lua51-lpeg lua51-luafilesystem update-alternatives"

inherit rpm
