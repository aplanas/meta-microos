SUMMARY = "Documentation for Lua, a small embeddable language"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
Lua combines procedural syntax (similar to Pascal) with \
data description constructs based on associative arrays and extensible \
semantics. Lua is dynamically typed, interpreted from byte codes, and \
has automatic memory management, making it suitable for configuration, \
scripting, and rapid prototyping. Lua is implemented as a small library \
of C functions, written in ANSI C."
LICENSE = "MIT"

PV = "5.4.4"

RPM_NAME = "lua54-doc-5.4.4-10.1.noarch.rpm"
RPM_HASH = "2a4ee762a55965dbf6ce451d9bf2f04cec52441688447127e1e48dbcf912f4aefbc3f212a58547a031695185c42fd307285ef1e3e7181e244e4cf6680a204576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua54-doc"
RDEPENDS:${PN} += ""

inherit rpm
