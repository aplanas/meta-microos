SUMMARY = "Header files for ulfius"
DESCRIPTION = "Development and header files for libulfius."
LICENSE = "MIT"

PV = "2.7.12"

RPM_NAME = "ulfius-devel-2.7.12-1.3.aarch64.rpm"
RPM_HASH = "85d6da50a38160080e02d598a92a332d33d7e7f95d1df34634a867ef07c4195a1fc00909b38e6e1a2296bfd4c36143e2922de887581a96b83b9c7ed91d597cbd"

RPROVIDES:${PN} += "cmake(Ulfius) pkgconfig(libulfius) ulfius-devel ulfius-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcurl-devel libgnutls-devel libjansson-devel libmicrohttpd-devel libulfius2_7 orcania-devel pkgconfig(gnutls) pkgconfig(jansson) pkgconfig(libcurl) pkgconfig(libmicrohttpd) pkgconfig(liborcania) pkgconfig(libyder) yder-devel zlib-devel"

inherit rpm
