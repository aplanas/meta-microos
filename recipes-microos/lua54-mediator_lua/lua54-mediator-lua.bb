SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
mediator_lua allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "1.120"

RPM_NAME = "lua54-mediator_lua-1.120-4.2.noarch.rpm"
RPM_HASH = "fe7422edf5fceccee8ead754439c098cd532cb41cf6a4156b0f5b0706257c9a5311c8d9be62099b0145b46ace66bb384a29d33e3a6730f71a1808e6ca4fa5949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-mediator_lua lua54-mediator_lua"
RDEPENDS:${PN} += "lua54"

inherit rpm
