SUMMARY = "Development headers for Boost.DateTime library"
DESCRIPTION = "This package contains development header files and libraries for \
Boost.DateTime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_date_time1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "51b15d1c9c5a13f0e46ceb43ce4b0b38bcd1ee170aae8baecbc484a09f97ebeee9e39663f2677996bcd607ae246fdc48dce001193b6b9d6f65b4ba8615823324"

RPROVIDES:${PN} += "libboost_date_time-devel-impl libboost_date_time1_82_0-devel libboost_date_time1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_date_time1_82_0 libboost_headers1_82_0-devel libstdc++-devel"

inherit rpm
