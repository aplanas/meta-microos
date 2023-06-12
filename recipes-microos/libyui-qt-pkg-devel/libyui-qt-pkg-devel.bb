SUMMARY = "Libyui-qt-pkg header files"
DESCRIPTION = "This package contains the Qt package selector component for libyui. \
 \
This can be used independently of YaST for generic (C++) applications. \
This package has very few dependencies."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-qt-pkg-devel-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "f2e2297aacbba1be6f129f12daf234c1cfe58f0716653b6c5d9b4ce114f688e158081575e377e56923026d54824c540abd37f2d1b2a942d491fe8a6bee38488e"

RPROVIDES:${PN} += "libyui-qt-pkg-devel libyui-qt-pkg-devel(aarch-64)"
RDEPENDS:${PN} += "libyui-qt-devel libyui-qt-pkg16 libzypp-devel"

inherit rpm
