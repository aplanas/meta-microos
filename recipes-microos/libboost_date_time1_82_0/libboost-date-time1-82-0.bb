SUMMARY = "Boost.DateTime runtime library"
DESCRIPTION = "This package contains the Boost Date.DateTime runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_date_time1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "9a72cc229b16a68bc07e4bb3e5d90da55ef6bdaa5e10d9f5e478bb9101ccbbd052939cb106aef75b7f4b22031e1923ed8ba02b730b349e85c6c7d81e75a06eba"

RPROVIDES:${PN} += "libboost_date_time.so.1.82.0()(64bit) libboost_date_time1_82_0 libboost_date_time1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0"

inherit rpm
