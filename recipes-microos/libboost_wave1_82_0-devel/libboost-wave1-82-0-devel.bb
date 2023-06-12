SUMMARY = "Development headers for Boost.Wave library"
DESCRIPTION = "This package contains development headers for Boost.Wave library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_wave1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "48d1cf6dd0bbcf6695a044f0ed47155d45daf84cf576748e17ed705fa29474b7c699ee316e5d620416cf20d57fefc8f59cb5455bbb53266c9de3aca7e4f0f0ba"

RPROVIDES:${PN} += "libboost_wave-devel-impl libboost_wave1_82_0-devel libboost_wave1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_chrono1_82_0-devel libboost_date_time1_82_0-devel libboost_filesystem1_82_0-devel libboost_headers1_82_0-devel libboost_serialization1_82_0-devel libboost_thread1_82_0-devel libboost_wave1_82_0"

inherit rpm
