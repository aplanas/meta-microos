SUMMARY = "Development files for raylib"
DESCRIPTION = "Development files and headers for raylib."
LICENSE = "Zlib"

PV = "4.2.0"

RPM_NAME = "raylib-devel-4.2.0-1.3.aarch64.rpm"
RPM_HASH = "5614270209f50ad049e9cff1a2dd265b50f249ba11f1c767fc08b46ee2e8d75f95ec5534a182e416f5f61af8bff49f003b62fa0623f710d76d10eacf99a30cf3"

RPROVIDES:${PN} += "cmake(raylib) pkgconfig(raylib) raylib-devel raylib-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libraylib420 openal-soft-devel"

inherit rpm
