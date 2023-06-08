SUMMARY = "Development files for zathura"
DESCRIPTION = "Development and header files for the zathura package."
LICENSE = "Zlib"

PV = "0.5.2"

RPM_NAME = "zathura-devel-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "8cfdbdfdbe25560b6f9796249f19a03957165dc831bd7ddb75cc93f9bcb1773178c0208fe743f2b02a1fc44112e66274883b4a778ca75cb0af1bde0d6ed068bd"

RPROVIDES:${PN} += "pkgconfig(zathura) zathura-devel zathura-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(cairo) pkgconfig(girara-gtk3) zathura"

inherit rpm
