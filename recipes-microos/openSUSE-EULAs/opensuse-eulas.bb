SUMMARY = "Collection of EULAs for openSUSE"
DESCRIPTION = "openSUSE-EULAs is a collection of the end user license agreements (EULAs) which \
govern use of certain (non-free) software. This software is typically packaged \
and maintained in the openSUSE NonFree repository."
LICENSE = "MIT"

PV = "84.87.20220520.1491bf6"

RPM_NAME = "openSUSE-EULAs-84.87.20220520.1491bf6-1.4.noarch.rpm"
RPM_HASH = "98015bdf3cabb57c53aef0cd4ebe691bb2deaf9661d2303d9feeecbec09e15655a77a8a85955ea37e0095d2e3f3e47ecf1d08c6fa1a8f1976a20a19e84514245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-EULAs \
package-EULAs"
RDEPENDS:${PN} += ""

inherit rpm
