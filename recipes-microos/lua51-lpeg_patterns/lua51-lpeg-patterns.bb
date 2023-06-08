SUMMARY = "Collection of LPEG patterns"
DESCRIPTION = "A collection of LPEG patterns \
 \
Use cases: \
 * Strict validation of user input \
 * Searching free-form input"
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "lua51-lpeg_patterns-0.5-2.7.noarch.rpm"
RPM_HASH = "4db6b1937b0d46fbaa823c91323fc2c339c0e4eca8a813822eadbcc7985f66e174b6e1c7470e228261daa64661f7ebccc5a014f1a89dd1624bcdb096b1beb99a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-lpeg_patterns"
RDEPENDS:${PN} += "lua51 lua51-lpeg"

inherit rpm
