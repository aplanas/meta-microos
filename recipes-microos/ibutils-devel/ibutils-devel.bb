SUMMARY = "SDK for OpenIB Mellanox InfiniBand Diagnostic Tools"
DESCRIPTION = "ibutils provides IB network and path diagnostics."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.5.7.0.2"

RPM_NAME = "ibutils-devel-1.5.7.0.2-11.8.aarch64.rpm"
RPM_HASH = "eb45388218f868d99b52760ed83e1103397457823783a4b1cd26d44d3d611d10efdd51b49657e4eaf387f8f6a9f87d341a3072cc1812d2b82963df51d7192953"

RPROVIDES:${PN} += "ibutils-devel ibutils-devel(aarch-64)"
RDEPENDS:${PN} += "ibutils libibdm1"

inherit rpm
