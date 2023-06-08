SUMMARY = "Header files for spdlog"
DESCRIPTION = "The spdlog-devel package contains C++ header files for developing \
applications that use spdlog."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "spdlog-devel-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "d34b98dc4745b79ffb0b8e676bef4a962df334874143f0aec1a9e795e8afcc008e9c1d14b96b233dc83c4ca2a6b463dfd07b1e68a59ae0a0bfbdd25f99764446"

RPROVIDES:${PN} += "cmake(spdlog) pkgconfig(spdlog) spdlog-devel spdlog-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libspdlog1_11 libstdc++-devel pkgconfig(fmt)"

inherit rpm
