SUMMARY = "Development files for Vacuum-IM"
DESCRIPTION = "This package includes files needed to develop Vacuum-IM modules."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "vacuum-im-devel-1.3.0+git1571036065.9f3952b2-1.20.aarch64.rpm"
RPM_HASH = "4253acdb41f73bc7ce0603509427fab12845dbfd46c13b0925734aaea1da38b3a675fed18762bff48e398881f2e41209896fe963656d1d5aec715e0aa730ae89"

RPROVIDES:${PN} += "vacuum-im-devel vacuum-im-devel(aarch-64)"
RDEPENDS:${PN} += "libvacuumutils37 vacuum-im"

inherit rpm
