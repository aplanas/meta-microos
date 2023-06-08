SUMMARY = "Process application arguments the same way as getopt_long"
DESCRIPTION = "alt-getopt is a module for Lua programming language for \
processing application's arguments the same way BSD/GNU \
getopt_long(3) functions do.  The main goal is compatibility \
with SUS 'Utility Syntax Guidelines' guidelines 3-13."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "lua54-alt-getopt-0.8.1-4.2.noarch.rpm"
RPM_HASH = "9341345f1d7e0f3b842bf515fe15113edf9005b55a91221641f0fb5dc517338a9c65c69eac81c95cd3b31b423d01e6817297b2e7ab21b5b6c1aa626133549d27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-alt-getopt lua54-alt-getopt"
RDEPENDS:${PN} += "lua54"

inherit rpm
