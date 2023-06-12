SUMMARY = "Includes static libraries for the ipmiutil package"
DESCRIPTION = "The ipmiutil-static package contains static libraries which are \
useful for building custom IPMI applications."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "ipmiutil-static-3.1.8-1.4.aarch64.rpm"
RPM_HASH = "5366f34d00711c205cfb4839aeb5fde3344b78433e393cfba0c9c7ea44a3c1de9c7da263a8a07f0205c030343efde34014a3f1bc190f2c9094cc7b2a1eb2974f"

RPROVIDES:${PN} += "ipmiutil-static \
ipmiutil-static(aarch-64)"
RDEPENDS:${PN} += "ipmiutil"

inherit rpm
