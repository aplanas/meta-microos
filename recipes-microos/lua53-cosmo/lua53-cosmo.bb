SUMMARY = "A “safe templates” engine for Lua"
DESCRIPTION = "Cosmo is a 'safe templates' engine.  It allows you to fill nested \
templates, providing many of the advantages of Turing-complete template \
engines, without the downside of allowing arbitrary code in the templates."
LICENSE = "MIT"

PV = "16.06.04"

RPM_NAME = "lua53-cosmo-16.06.04-2.1.noarch.rpm"
RPM_HASH = "9a8560aab2da02959a919e265d5c73470145dd1539e8c86592a41d709839c1fb2090b3e66d61c1fd3ae9531e6981666fca212184361dd38d225ec6754f138172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-cosmo"
RDEPENDS:${PN} += "lua53 \
lua53-lpeg"

inherit rpm
