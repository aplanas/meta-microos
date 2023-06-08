SUMMARY = "Unicode CLDR data and Lua interface"
DESCRIPTION = "Unicode CLDR (Common Locale Data Repository) data and Lua interface. \
The Unicode CLDR provides key building blocks for software to support \
the world's languages, with the largest and most extensive standard \
repository of locale data available."
LICENSE = "MIT & Unicode-TOU"

PV = "0.3.0"

RPM_NAME = "lua54-cldr-0.3.0-2.1.noarch.rpm"
RPM_HASH = "c3e1a9017ad4e36735a73912c02996a45b973b320c37cc3646097decf250cc557761a17545f8f861438a942d90fcfc7d1e1d00deacf36d270b7828465a2fdd5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-cldr lua54-cldr"
RDEPENDS:${PN} += "lua54 lua54-penlight"

inherit rpm
