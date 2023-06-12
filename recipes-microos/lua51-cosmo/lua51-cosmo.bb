SUMMARY = "A “safe templates” engine for Lua"
DESCRIPTION = "Cosmo is a 'safe templates' engine.  It allows you to fill nested \
templates, providing many of the advantages of Turing-complete template \
engines, without the downside of allowing arbitrary code in the templates."
LICENSE = "MIT"

PV = "16.06.04"

RPM_NAME = "lua51-cosmo-16.06.04-2.1.noarch.rpm"
RPM_HASH = "b2920b0488ddd9a55eb6717d321485efc2da34b81e9f37876fa9cad4f045debc72cdd9cd1d42840466817eb2d64906b8d71707f4cce8512fba2b5e7179fc4149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-cosmo"
RDEPENDS:${PN} += "lua51 \
lua51-lpeg"

inherit rpm
