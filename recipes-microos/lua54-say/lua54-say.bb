SUMMARY = "Lua string hashing library, useful for internationalization"
DESCRIPTION = "Useful for internationalization."
LICENSE = "MIT"

PV = "1.31"

RPM_NAME = "lua54-say-1.31-5.1.noarch.rpm"
RPM_HASH = "8def87b5871b80b307ccaac0458dcd0f84166e35709de3c5e3dc1b4d2ea1502cd05d4e35000a8e0a859c6e8abc66ac8939b9f9452cf924521c04b33b9ae18f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-say lua54-say"
RDEPENDS:${PN} += "lua54"

inherit rpm
