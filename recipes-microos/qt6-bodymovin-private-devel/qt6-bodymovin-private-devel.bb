SUMMARY = "Development files for the Qt 6 Bodymovin library"
DESCRIPTION = "This package provides private headers of libQt6Bodymovin that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-bodymovin-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b87369081c24b91e28960a771a6a2c295a08fa035133e6f63ab4067fcacbbcdb03c3cd29d9ed336ab4e68254e89ddd4dc095e4085b14ae2f8edf1165715b0a5b"

RPROVIDES:${PN} += "cmake(Qt6BodymovinPrivate) qt6-bodymovin-devel qt6-bodymovin-private-devel qt6-bodymovin-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Gui)"

inherit rpm
