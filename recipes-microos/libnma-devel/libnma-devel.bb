SUMMARY = "Development Files for libnma"
DESCRIPTION = "Development Files for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-devel-1.10.6-1.3.aarch64.rpm"
RPM_HASH = "a32d41121de6e51affb2223d20f0c3002884520b45f66ccdafe9cd71a7a097404ac62277dbb1820ec85964c871e30a707a1f131d4c03b9e24cd95c322ed72685"

RPROVIDES:${PN} += "libnma-devel \
libnma-devel(aarch-64) \
pkgconfig(libnma)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnma0 \
pkgconfig(libnm) \
typelib-1_0-NMA-1_0"

inherit rpm
