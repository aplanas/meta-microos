SUMMARY = "Non-ABI stable API for the Qt 6 3DLogic library"
DESCRIPTION = "This package provides private headers of libQt63DLogic that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dlogic-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "656e25ea0e8a9bae9505d8f7baef0cfa7b67ff7054b6514273344fbcb60e141408d695e85e8ae8c86a23a950b9cbb6b75f104189df6488a6c95e662e6a93ac88"

RPROVIDES:${PN} += "qt6-3dlogic-private-devel qt6-3dlogic-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DLogic)"

inherit rpm
