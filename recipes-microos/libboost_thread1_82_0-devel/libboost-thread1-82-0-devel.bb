SUMMARY = "Development headers for Boost.Thread library"
DESCRIPTION = "This package contains development headers for Boost.Thread library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_thread1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "02fba5bb447da09c7d34d3ba8dcc2232ae5eaed1e5df29f9bd7cfada858940817088427ddfced6e2f21e1860c96259d8efe2ff5ba956045f9e2b10ff0ef4122d"

RPROVIDES:${PN} += "libboost_thread-devel-impl \
libboost_thread1_82_0-devel \
libboost_thread1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_chrono1_82_0-devel \
libboost_date_time1_82_0-devel \
libboost_headers1_82_0-devel \
libboost_thread1_82_0"

inherit rpm
