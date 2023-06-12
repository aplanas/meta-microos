SUMMARY = "Performance Co-Pilot (PCP) development headers"
DESCRIPTION = "Performance Co-Pilot (PCP) headers for development."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp-devel-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "737ae73d79253279ec3db672039c6b7deb932c85ddbcc347523fc78997155e5dca3ca4c02bf7c4ea869b26b19c42c076fe81b42aa9b3e739231a45ba49cca388"

RPROVIDES:${PN} += "libpcp-devel \
libpcp-devel(aarch-64) \
pcp-devel \
pkgconfig(libpcp) \
pkgconfig(libpcp_import) \
pkgconfig(libpcp_pmda)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpcp3 \
libpcp_gui2"

inherit rpm
