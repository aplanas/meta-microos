SUMMARY = "Unit testing framework with a focus on being easy to use"
DESCRIPTION = "busted is a unit testing framework with a focus on being easy to \
use. busted works with lua >= 5.1, moonscript, terra, and LuaJIT \
>= 2.0.0. \
 \
busted test specs read naturally without being too verbose. You \
can even chain asserts and negations, such as assert.not.equals. \
Nest blocks of tests with contextual descriptions using describe, \
and add tags to blocks so you can run arbitrary groups of tests. \
 \
An extensible assert library allows you to extend and craft your \
own assert functions specific to your case with method chaining. \
A modular output library lets you add on your own output format, \
along with the default pretty and plain terminal output, JSON \
with and without streaming, and TAP-compatible output that allows \
you to run busted specs within most CI servers. You can even \
register phrases for internationaliation with custom or built-in \
language packs."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "lua51-busted-2.0.0-6.1.noarch.rpm"
RPM_HASH = "aa4fbd57bfa47bd5471673b55b68361b5974fc2a0828def30d2f8db563fc3064a6f226bd0d574e2e724df5b86bf3d71d9bfbf60bff1dc31ceb4d2f6cfdfee615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-busted"
RDEPENDS:${PN} += "/bin/sh /usr/bin/lua5.1 curl lua51 lua51-cliargs lua51-dkjson lua51-lua-ev lua51-luafilesystem lua51-luassert lua51-luasystem lua51-luaterm lua51-mediator_lua lua51-penlight lua51-say openssl unzip update-alternatives"

inherit rpm
