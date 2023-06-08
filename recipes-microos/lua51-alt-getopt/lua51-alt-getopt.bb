SUMMARY = "Process application arguments the same way as getopt_long"
DESCRIPTION = "alt-getopt is a module for Lua programming language for \
processing application's arguments the same way BSD/GNU \
getopt_long(3) functions do.  The main goal is compatibility \
with SUS 'Utility Syntax Guidelines' guidelines 3-13."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "lua51-alt-getopt-0.8.1-4.2.noarch.rpm"
RPM_HASH = "ede14740c63e7745a3b783c8fded15fc9cba156d720c0abc2e84819a7b3f438fb80e39c9e46e5b69de3ccebe50d3231c9b743f951f02df9cb77c96852301bf74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-alt-getopt"
RDEPENDS:${PN} += "lua51"

inherit rpm
