SUMMARY = "Development files for libomemo-c"
DESCRIPTION = "Development files and headers for libomemo-c"
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libomemo-c-devel-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "0586127a4a8c63aeb9f4ec95ba4c9b6c8975dabfc832bc87da877905f7f325927db587d0f6bb37e0b2104a1ecfa176ce570278678405476ab9fce7af22263189"

RPROVIDES:${PN} += "libomemo-c-devel libomemo-c-devel(aarch-64) pkgconfig(libomemo-c)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libomemo-c0"

inherit rpm
