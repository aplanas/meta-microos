SUMMARY = "Header files and libraries for redis++"
DESCRIPTION = "The redis++-devel package contains the header files and \
libraries for redis-plus-plus."
LICENSE = "Apache-2.0"

PV = "1.3.7"

RPM_NAME = "redis++-devel-1.3.7-2.1.aarch64.rpm"
RPM_HASH = "89ad9d8088f68ac14c99ffa8bb4303d54eec1601b7c57e5641ddb13e42e61afce1fe22610056563f232987c30b46fa90ca5eb417d04a21669208eba2f0f106c4"

RPROVIDES:${PN} += "cmake(redis++) pkgconfig(redis++) redis++-devel redis++-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libredis++1 pkgconfig(hiredis) pkgconfig(hiredis_ssl)"

inherit rpm
