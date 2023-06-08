SUMMARY = "Non-ABI stable API for the Qt 6 QuickTemplates2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickTemplates2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quicktemplates2-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "438d53abe87c49d96b8a83d9c57dac31085883064f1b1354adf30f039a8eae4aeab3e1ead818e601e8443c0e041310c888e8b67987eba3c958a13ace8e64fbce"

RPROVIDES:${PN} += "qt6-quicktemplates2-private-devel qt6-quicktemplates2-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickTemplates2)"

inherit rpm
