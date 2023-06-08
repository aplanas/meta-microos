SUMMARY = "Tools to work with logging"
DESCRIPTION = "jaraco.logging Tools for working with logging."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "python311-jaraco.logging-3.1.2-1.8.noarch.rpm"
RPM_HASH = "283e4d87b9911269e041d584535175d97dfd8ada617cbf142525fd2f550d9d53157419c1df80bc79ab3d0e41ee7552770164a1ddf9bd7a1d048b358088be3afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.logging) python311-jaraco.logging python3dist(jaraco.logging)"
RDEPENDS:${PN} += "python(abi) python311-tempora"

inherit rpm
