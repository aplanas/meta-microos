SUMMARY = "Header files for lua51-luasocket"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua51-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua51-luasocket-devel-3.1.0-2.2.aarch64.rpm"
RPM_HASH = "f5b331389650003202c7ecaa8c723370ce32e97b5027d485ccc56b59ce9b5dd881e188e33a8be35921b9c8c0cdd466ea7cdc94c462554501d4064d1195a5f29c"

RPROVIDES:${PN} += "lua51-luasocket-devel lua51-luasocket-devel(aarch-64)"
RDEPENDS:${PN} += "lua51-luasocket"

inherit rpm
