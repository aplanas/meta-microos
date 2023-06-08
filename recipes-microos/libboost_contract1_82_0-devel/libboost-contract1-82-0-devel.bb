SUMMARY = "Development headers for Boost.Contract"
DESCRIPTION = "Development headers and libraries for Boost.Contract, a library \
that implements Design by Contract or DbC or contract programming."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_contract1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "fc8086216c2f3600ccaac96cacdca413f30b80f8ac122a4dc82aa925d2eb3de1abb8ce10a7e774682c30affb054f8880263023909b11c673d1d0530e39dc8a09"

RPROVIDES:${PN} += "libboost_contract-devel-impl libboost_contract1_82_0-devel libboost_contract1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_contract1_82_0 libboost_headers1_82_0-devel libboost_system1_82_0-devel libstdc++-devel"

inherit rpm
