SUMMARY = "Development headers for Boost.Random library"
DESCRIPTION = "This package contains Boost.Random development headers."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_random1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "0e8cf0899696ea3847ee6e716da93504f80a74988111a8cdea75b828716517915cc133de58791b414e9ddc0f3b2538cdcb597bb187a0123e887a834bbd3ba14d"

RPROVIDES:${PN} += "libboost_random-devel-impl libboost_random1_82_0-devel libboost_random1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel libboost_random1_82_0 libboost_system1_82_0-devel"

inherit rpm
