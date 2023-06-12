SUMMARY = "Discover and load entry points from installed packages"
DESCRIPTION = "Entry points are a way for Python packages to advertise objects with \
some common interface. The most common examples are console_scripts \
entry points, which define shell commands by identifying a Python \
function to run. \
 \
Groups of entry points, such as console_scripts, point to objects with \
similar interfaces. An application might use a group to find its \
plugins, or multiple groups if it has different kinds of plugins."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-entrypoints-0.4-1.3.noarch.rpm"
RPM_HASH = "517d6d0481fb42d52ed7315e4395619431b72c95152c067caf7576fc0253aca5bf71efe310e8d7da0db0d4324c414da40db175fd68348ed105fc827d2aa1dfa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(entrypoints) \
python311-entrypoints \
python3dist(entrypoints)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
