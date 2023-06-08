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

RPM_NAME = "lua53-busted-2.0.0-6.1.noarch.rpm"
RPM_HASH = "50427061a79deb732933ea1d14cf705eaf068502f1d932aa38beae9519b8920012f561efb6dd5d11ef6f56a3123bc55cbdf6383aa3966a31df50160928b4ef62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-busted"
RDEPENDS:${PN} += "/bin/sh /usr/bin/lua5.3 curl lua53 lua53-cliargs lua53-dkjson lua53-lua-ev lua53-luafilesystem lua53-luassert lua53-luasystem lua53-luaterm lua53-mediator_lua lua53-penlight lua53-say openssl unzip update-alternatives"

inherit rpm
