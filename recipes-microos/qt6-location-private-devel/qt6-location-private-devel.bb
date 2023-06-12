SUMMARY = "Non-ABI stable API for the Qt 6 Location Library"
DESCRIPTION = "This package provides private headers of libQt6Location that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "124e6575744f5d0137289475b80331ea0ee454e0480d5b5717f60792623dffc0ab7f70d153b431feced1e6e04343a9918c4e313632eba2fbd159a9620a23aeb9"

RPROVIDES:${PN} += "qt6-location-private-devel qt6-location-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Location)"

inherit rpm
