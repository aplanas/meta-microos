SUMMARY = "Development files for littleb"
DESCRIPTION = "LittleB provides a Bluetooth Low Energy API. It exposes the BLE GATT \
API for C using BlueZ over SD-Bus. \
 \
This package contains development files for littleb."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "littleb-devel-0.1.2-1.22.aarch64.rpm"
RPM_HASH = "964a064c4037a32872947d035d4ba1d365adaf8662bd9ed380583738f3f4b6608cf99dc8b27872f49232f6ab8ea6f46ceda5aa84432c628870ee60dbb46cecb6"

RPROVIDES:${PN} += "littleb-devel \
littleb-devel(aarch-64) \
pkgconfig(littleb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblittleb0"

inherit rpm
