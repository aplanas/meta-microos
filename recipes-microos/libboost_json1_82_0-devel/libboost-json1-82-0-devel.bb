SUMMARY = "Development headers for Boost.JSON library"
DESCRIPTION = "This package contains development headers for Boost.JSON library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_json1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "ba69f5d1ad6b45d46a8f214a7ceab5e5df6612442039084dde5d251ae29db404e64ba1bd3e186fade75fae700f2327e91cf860059b81b00faedebf4dde8017a4"

RPROVIDES:${PN} += "libboost_json-devel-impl libboost_json1_82_0-devel libboost_json1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_container1_82_0-devel libboost_json1_82_0"

inherit rpm
