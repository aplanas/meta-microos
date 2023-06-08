SUMMARY = "Development files for Osmocom's Media Gateway Control Protocol client library"
DESCRIPTION = "Osmocom's Media Gateway Control Protocol client librarary. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-mgcp-client."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "libosmo-mgcp-client-devel-1.9.0-1.9.aarch64.rpm"
RPM_HASH = "572038eeca2ce1e34837ccb23b8a0f53490a05b669eb600d1c379fb2320b593e4a0b6804496655d70ef98c0f2dbac56b9775a4bbb705fb8c7641b45cd72fe5c2"

RPROVIDES:${PN} += "libosmo-mgcp-client-devel libosmo-mgcp-client-devel(aarch-64) pkgconfig(libosmo-mgcp-client)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-mgcp-client9"

inherit rpm
