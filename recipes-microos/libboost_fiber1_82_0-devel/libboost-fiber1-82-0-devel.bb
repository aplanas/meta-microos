SUMMARY = "Development headers for Boost.Fiber library"
DESCRIPTION = "This package contains development header files and libraries for \
Boost.Fiber library. Boost.Fiber is a cooperative multi-tasking \
userland threading library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_fiber1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "679221e470a474fa02337f3ec446251764791d2330f591eaf9852900f3943bd3fee8127272c8bdb96bbf68080f58d6c8c0526d80af4bb764adaa4b35d0899d88"

RPROVIDES:${PN} += "libboost_fiber-devel-impl libboost_fiber1_82_0-devel libboost_fiber1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_context1_82_0-devel libboost_fiber1_82_0 libboost_filesystem1_82_0-devel libboost_headers1_82_0-devel libstdc++-devel"

inherit rpm
