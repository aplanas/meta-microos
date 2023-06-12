SUMMARY = "A lazy plugin management system for Python"
DESCRIPTION = "LML is 'Load me later'. lml seamlessly finds the lml-based \
plugins from the current Python environment but loads plugins on \
demand. It supports plugins that have external dependencies, \
especially bulky and/or memory hungry ones. lml provides the plugin \
management system only and the plugin interface is for the developer \
to do. \
 \
Plugins loaded by lml may be installed packages or standalone \
Python modules in a supplied directory."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python310-lml-0.1.0-1.6.noarch.rpm"
RPM_HASH = "816acfbe454d5c16893745f66c5bc9ef6dac64200769408045cdd57145c21706ffe57337d1f97a2fc0669fb432aae44e76d2574545ada3d527c0183bb2e59686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lml \
python3.10dist(lml) \
python310-lml \
python3dist(lml)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
