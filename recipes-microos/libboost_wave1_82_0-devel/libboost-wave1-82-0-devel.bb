SUMMARY = "Development headers for Boost.Wave library"
DESCRIPTION = "This package contains development headers for Boost.Wave library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_wave1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "323bb0568568679b6e7db3b953d5c0de5dc088f74ff33c8108c49627b7d1af38615e426bbb027a8278f10a32bac12d6e11d498f06c4e936072d9363e4f94d41f"

RPROVIDES:${PN} += "libboost_wave-devel-impl libboost_wave1_82_0-devel libboost_wave1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_chrono1_82_0-devel libboost_date_time1_82_0-devel libboost_filesystem1_82_0-devel libboost_headers1_82_0-devel libboost_serialization1_82_0-devel libboost_thread1_82_0-devel libboost_wave1_82_0"

inherit rpm
