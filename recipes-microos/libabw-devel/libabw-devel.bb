SUMMARY = "Files for Developing with libabw"
DESCRIPTION = "Libabw is library providing ability to interpret and import AbiWord documents \
into various applications. \
 \
This package contains the libabw development files."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libabw-devel-0.1.3-1.18.aarch64.rpm"
RPM_HASH = "102780f0bda6fb0f6fdeb8f5546a34f6ca48338b7ae2f3387861cb6aab5d5e84d46f549fe763d31b6f93938c28d7dbc84139ea27c43327044e2597811d3df232"

RPROVIDES:${PN} += "libabw-devel libabw-devel(aarch-64) pkgconfig(libabw-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libabw-0_1-1 pkgconfig(librevenge-0.0) pkgconfig(librevenge-stream-0.0) pkgconfig(libxml-2.0) pkgconfig(zlib)"

inherit rpm
