SUMMARY = "Development files of libvterm"
DESCRIPTION = "This package contains the development files of libvterm."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "libvterm-devel-0.3.1-1.3.aarch64.rpm"
RPM_HASH = "84d8c2584ec4413128e1d0b9630b0869208ebca454f6d60512ad78b0f82d785ebcc6f4e448d4581b94ee22805a4db55ebbf62e22d49a2fb6189da9dbbe562dcb"

RPROVIDES:${PN} += "libvterm-devel libvterm-devel(aarch-64) pkgconfig(vterm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvterm0"

inherit rpm
