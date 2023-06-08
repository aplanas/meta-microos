SUMMARY = "Development files for muparser"
DESCRIPTION = "muParser is an extensible math parser library written in C++. It \
works by transforming a mathematical expression into bytecode and \
precalculating constant parts of the expression."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "muparser-devel-2.3.4-1.3.aarch64.rpm"
RPM_HASH = "8e4387924bcd84efb085f894becd75db05f135eb69868d1d9120c61f1a11905f38ba6950320cee4d8701dacf3f3598db8b9eeb0ba95d1cf1ada8574a3ff459f3"

RPROVIDES:${PN} += "cmake(muparser) muparser-devel muparser-devel(aarch-64) pkgconfig(muparser)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmuparser2_3_4"

inherit rpm
