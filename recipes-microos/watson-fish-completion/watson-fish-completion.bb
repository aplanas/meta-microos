SUMMARY = "Fish completion for watson"
DESCRIPTION = "Fish command line completion support for watson."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-fish-completion-2.1.0-1.4.noarch.rpm"
RPM_HASH = "d288abb9b181ad15e3d8c2a85fbd9ba875f695097bfc39131f5451e13cea2a36b8d17674e3dddf71c25f23a21317a1ce7d83a46b2654ed0b271a54865197f583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "watson-fish-completion"
RDEPENDS:${PN} += "watson"

inherit rpm
