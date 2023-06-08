SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
cliargs allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "3.02"

RPM_NAME = "lua51-cliargs-3.02-5.2.noarch.rpm"
RPM_HASH = "c324c8c9419ec8b44ea9fe4c7435d32666a4464fd731f000e428eee98265f29d0d345ff3ae79d8555218c16ad7c2d9e030d06ebf7a65e2627813daa4a24942a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-cliargs"
RDEPENDS:${PN} += "lua51"

inherit rpm
