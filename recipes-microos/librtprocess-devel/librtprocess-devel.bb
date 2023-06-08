SUMMARY = "Development files for librtprocess"
DESCRIPTION = "This is a project that aims to make some of RawTherapee's highly optimized raw \
processing routines readily available for other FOSS photo editing software. \
 \
This package holds the development files."
LICENSE = "BSL-1.0 & GPL-3.0-or-later"

PV = "0.12.0+20211228"

RPM_NAME = "librtprocess-devel-0.12.0+20211228-1.6.aarch64.rpm"
RPM_HASH = "678c80f22e64100239f3de1661dc1add399fc88ee2a96499eddabbec4367653b22150605baf2974468437f755237b031f09cab8a8371922bd21a2bb3cb717315"

RPROVIDES:${PN} += "cmake(rtprocess) librtprocess-devel librtprocess-devel(aarch-64) pkgconfig(rtprocess)"
RDEPENDS:${PN} += "/usr/bin/pkg-config librtprocess0"

inherit rpm
