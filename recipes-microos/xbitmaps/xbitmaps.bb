SUMMARY = "Base X bitmaps"
DESCRIPTION = "This package contains the base X bitmaps, which are used in many \
legacy X clients."
LICENSE = "X11"

PV = "1.1.3"

RPM_NAME = "xbitmaps-1.1.3-2.1.noarch.rpm"
RPM_HASH = "e41293cc5a66970bae455ae9c5b59dd9fa8a96eea0a6adb3dc2668675367e45892d5faf89ae276759e026ef183fb85a48be54279ab506bb66066677eee20bc3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xbitmaps"
RDEPENDS:${PN} += ""

inherit rpm
