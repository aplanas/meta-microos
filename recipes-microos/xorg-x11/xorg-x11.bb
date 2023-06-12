SUMMARY = "Compatibility metapackage for X.Org sample applications"
DESCRIPTION = "This package is a compatibility metapackage. It used to contain the \
X.Org sample applications."
LICENSE = "MIT"

PV = "7.6_1"

RPM_NAME = "xorg-x11-7.6_1-16.16.noarch.rpm"
RPM_HASH = "4bb6f381b0b5207bb942977e0afa87b5deade716020d577981e8dbc2dda9806aa0cc8252ea242c579af1b0d6f6e83ab2f4a0698ea07bedad0966755414860b89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "XFree86 \
xorg-x11"
RDEPENDS:${PN} += "xorg-x11-essentials"

inherit rpm
