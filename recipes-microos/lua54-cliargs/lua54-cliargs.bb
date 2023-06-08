SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
cliargs allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "3.02"

RPM_NAME = "lua54-cliargs-3.02-5.2.noarch.rpm"
RPM_HASH = "cf451ee81d7e727f37c1e6bb5fa2be6903b17e072eb85071f879ee80c2cc1fe105da9a2f62b028f4983095ccde7c278291e427ee6f2be513238abd98fb4d7d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-luacliargs lua54-cliargs"
RDEPENDS:${PN} += "lua54"

inherit rpm
