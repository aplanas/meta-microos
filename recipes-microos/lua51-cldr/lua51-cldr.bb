SUMMARY = "Unicode CLDR data and Lua interface"
DESCRIPTION = "Unicode CLDR (Common Locale Data Repository) data and Lua interface. \
The Unicode CLDR provides key building blocks for software to support \
the world's languages, with the largest and most extensive standard \
repository of locale data available."
LICENSE = "MIT & Unicode-TOU"

PV = "0.3.0"

RPM_NAME = "lua51-cldr-0.3.0-2.1.noarch.rpm"
RPM_HASH = "4822ed3532591a9a374f2174a09e5f6c559b365110c26758475b4cd3cd862a4367ca39645a79c25794722703f291b4de325cef891fa65e667479b0f95bc6841a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-cldr"
RDEPENDS:${PN} += "lua51 lua51-penlight"

inherit rpm
