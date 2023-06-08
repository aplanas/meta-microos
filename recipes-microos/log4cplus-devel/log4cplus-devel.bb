SUMMARY = "Development files for log4cplus"
DESCRIPTION = "This package provides development libraries and headers needed to \
build software making use of log4cplus"
LICENSE = "Apache-2.0"

PV = "2.0.8"

RPM_NAME = "log4cplus-devel-2.0.8-1.4.aarch64.rpm"
RPM_HASH = "dfde4b5ac1c34f4bc89a5786b821e7627533246e4bc72fc6e30d298b45cab8fe7d6f0623ff7eebedce61bdcd9ab4c7760fb3811d3d1f889cf76d5216cac390b8"

RPROVIDES:${PN} += "log4cplus-devel log4cplus-devel(aarch-64) pkgconfig(log4cplus)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblog4cplus-2_0-3"

inherit rpm
