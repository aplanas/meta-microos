SUMMARY = "Development files for OsmoSDR"
DESCRIPTION = "Library headers for OsmoSDR. \
OsmoSDR is a software-based small form factor Software Defined Radio project."
LICENSE = "GPL-3.0"

PV = "0.1+git.20151211"

RPM_NAME = "osmosdr-devel-0.1+git.20151211-1.24.aarch64.rpm"
RPM_HASH = "a22e83e5a0bf0d1e8bb77edef5284a97d87c2f13305e03f9c2da822b2221332f3f4f988c715898621803b5cf947b991c7fcc678d7fef199ef63d6ed8b885e9f7"

RPROVIDES:${PN} += "osmosdr-devel osmosdr-devel(aarch-64) pkgconfig(libosmosdr)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmosdr0"

inherit rpm
