SUMMARY = "Qt6 BundledPhysX static library"
DESCRIPTION = "The Qt6 BundledPhysX static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-bundledphysx-devel-static-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "77cf7eea3931198dc2d7a3dd673d27d35397212bf99a86bb7e292ac728df0a709670895c487f4f7fdacb41a077af9b348ab8d6dbe8421121a687cf42beda7a82"

RPROVIDES:${PN} += "cmake(Qt6BundledPhysX) qt6-bundledphysx-devel-static qt6-bundledphysx-devel-static(aarch-64)"
RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
