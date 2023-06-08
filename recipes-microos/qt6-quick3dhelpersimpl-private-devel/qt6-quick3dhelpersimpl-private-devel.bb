SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpersImpl that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dhelpersimpl-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d5f9afcd662d0c48dce2f4bc68bc5e8f0e854b16eeb8442908c835af5b77a5eeb10e148bc22a4c416dfdce50c2e977cae9d57fe35ebc2588d0ca05937cc78c13"

RPROVIDES:${PN} += "qt6-quick3dhelpersimpl-private-devel qt6-quick3dhelpersimpl-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3DHelpersImpl)"

inherit rpm
