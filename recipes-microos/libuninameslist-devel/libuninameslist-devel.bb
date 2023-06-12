SUMMARY = "Header files for libuninameslist"
DESCRIPTION = "This package contains header files for libuninameslist."
LICENSE = "BSD-3-Clause"

PV = "20221022"

RPM_NAME = "libuninameslist-devel-20221022-1.2.aarch64.rpm"
RPM_HASH = "d8d1abde8956fec15bde4beba7b76e6e3830f027146c95374fe92f4c96616144f9a0d91a0e0f6ed79845400547596d4861bb1d5ab978688eba80f304ddad793f"

RPROVIDES:${PN} += "libuninameslist-devel \
libuninameslist-devel(aarch-64) \
pkgconfig(libuninameslist)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuninameslist1"

inherit rpm
