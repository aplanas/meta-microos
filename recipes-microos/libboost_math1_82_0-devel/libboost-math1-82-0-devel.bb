SUMMARY = "Development headers for Boost.Math libraries"
DESCRIPTION = "Development headers for Boost.Math* boost libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_math1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "b0736e76b41d882ac5ed62348001842711597a2cb26085865c632c9fe2b9047a19810f533703e4960e07e607ac912e63ccb1e70cae14c95eac4e9a45c04c061f"

RPROVIDES:${PN} += "libboost_math-devel-impl libboost_math1_82_0-devel libboost_math1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel libboost_math1_82_0"

inherit rpm
