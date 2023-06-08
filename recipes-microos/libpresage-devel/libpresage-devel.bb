SUMMARY = "Intelligent predictive text entry platform (development files)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains development files. \
 \
This package contains the header files needed to compile applications or shared objects that use libpresage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "libpresage-devel-0.9.1-12.10.aarch64.rpm"
RPM_HASH = "a510870461ab5cef1d94878bb937963c064d357b18b602871eaf557ab514945ecafc7416eb4fbaf5941a783758ea0b1e92b6dc1f0e195340b66e5602134960c1"

RPROVIDES:${PN} += "libpresage-devel libpresage-devel(aarch-64)"
RDEPENDS:${PN} += "libpresage1"

inherit rpm
