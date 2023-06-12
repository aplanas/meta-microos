SUMMARY = "Header files and libraries for redis++"
DESCRIPTION = "The redis++-devel package contains the header files and \
libraries for redis-plus-plus."
LICENSE = "Apache-2.0"

PV = "1.3.8"

RPM_NAME = "redis++-devel-1.3.8-1.1.aarch64.rpm"
RPM_HASH = "6424dae4eac341e08745e536e65c6d77e118c917750b1f146cb577e5a30cb0617f3ffee49b35d453d70363ede41e495e5b013a2be323c14f5ddb681f5660cc4b"

RPROVIDES:${PN} += "cmake(redis++) \
pkgconfig(redis++) \
redis++-devel \
redis++-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libredis++1 \
pkgconfig(hiredis) \
pkgconfig(hiredis_ssl)"

inherit rpm
