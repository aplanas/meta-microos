SUMMARY = "Libyui - REST API header files"
DESCRIPTION = "This package provides a libyui REST API plugin. \
 \
This is a development subpackage."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-rest-api-devel-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "580e8cf41f13a8c0113701a25065d194555feb3757a98e8033d36f040c625ad2573fabf7321970e30f1529f9532d1f974c9688c5edb9fca32d2ffc82d86d2d83"

RPROVIDES:${PN} += "libyui-rest-api-devel libyui-rest-api-devel(aarch-64)"
RDEPENDS:${PN} += "boost-devel glibc-devel jsoncpp-devel libmicrohttpd-devel libstdc++-devel libyui-devel libyui-rest-api16"

inherit rpm
