SUMMARY = "Unicode CLDR data and Lua interface"
DESCRIPTION = "Unicode CLDR (Common Locale Data Repository) data and Lua interface. \
The Unicode CLDR provides key building blocks for software to support \
the world's languages, with the largest and most extensive standard \
repository of locale data available."
LICENSE = "MIT & Unicode-TOU"

PV = "0.3.0"

RPM_NAME = "lua53-cldr-0.3.0-2.1.noarch.rpm"
RPM_HASH = "470b72dabae14d489269228fd866419e1448e400a28cc25d5fc1801221e4d325bd0199cdacffd89f561df8bbf09149f68077316628ed0ba63c9bed27fe11c354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-cldr"
RDEPENDS:${PN} += "lua53 lua53-penlight"

inherit rpm
