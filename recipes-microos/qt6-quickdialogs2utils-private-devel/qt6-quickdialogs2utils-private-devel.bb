SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Utils that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickdialogs2utils-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "aeeea76ea9a6c026f0ca090160ed69ec77af2924b08616d8049d5d19d6d580f2704f6e5ea3f4684ceb58524e3817fbb3b8c4be7419ae4caca92acf1be4c8bfa9"

RPROVIDES:${PN} += "qt6-quickdialogs2utils-private-devel qt6-quickdialogs2utils-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickDialogs2Utils)"

inherit rpm
