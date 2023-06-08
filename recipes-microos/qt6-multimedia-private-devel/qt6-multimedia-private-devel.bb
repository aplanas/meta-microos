SUMMARY = "Non-ABI stable API for the Qt 6 Multimedia Library"
DESCRIPTION = "This package provides private headers of libQt6Multimedia that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-multimedia-private-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "37474ecafbc20889ec00d6a95774b3b33d37d4a58b14d7d18b6b168b96d6b69f9c5fec42d16cbbb7cb0d60f12e31a4c1bbf4fb3d3056f2b44ab9815e5e3d9106"

RPROVIDES:${PN} += "qt6-multimedia-private-devel qt6-multimedia-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Multimedia)"

inherit rpm
