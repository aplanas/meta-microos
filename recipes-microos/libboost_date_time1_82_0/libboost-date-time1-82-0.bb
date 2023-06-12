SUMMARY = "Boost.DateTime runtime library"
DESCRIPTION = "This package contains the Boost Date.DateTime runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_date_time1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "818c28056654fec4f5d525bb0b61f378829a1163a78e7846817bc8c06b082ddcd28ed659bdaec5580ff80e0648d36756c0e07ed500d90bc70524de20cc5dcf92"

RPROVIDES:${PN} += "libboost_date_time.so.1.82.0()(64bit) libboost_date_time1_82_0 libboost_date_time1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0"

inherit rpm
