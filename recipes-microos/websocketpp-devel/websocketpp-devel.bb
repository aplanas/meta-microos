SUMMARY = "Development files for websocketpp, a C++ WebSocket Protocol Library"
DESCRIPTION = "WebSocket++ is a header-only C++ library \
that implements RFC6455, the WebSocket protocol. It allows integrating \
WebSocket client and server functionality into C++ programs. It uses \
interchangeable network transport modules including one based on C++ \
iostreams and one based on Boost Asio."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "websocketpp-devel-0.8.2-3.9.noarch.rpm"
RPM_HASH = "d67477f3d1a283feca1cead8590deefebac739f0efe32ec9e6bfbb14ac852a12f4cf85c3a2fac5b9980c6cad9f8f48c2608b52d5f95e98102e78c7fcaf7d62a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(websocketpp) pkgconfig(websocketpp) websocketpp-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
