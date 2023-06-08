SUMMARY = "Development headers for Boost.Coroutine"
DESCRIPTION = "This package provides headers for Boost.Coroutine libraries. \
Boost.Coroutine2 provides templates for generalized subroutines which \
allow suspending and resuming execution at certain locations."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_coroutine1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "2e90f3b678e5ad59298d98edd8cddb1cf72085e1646eb7a0ef7754b04b83c062a6856113d0c43332e4f03008f0bcc55b3894182442d0ce69f7ebd4405de07b6b"

RPROVIDES:${PN} += "libboost_coroutine-devel-impl libboost_coroutine1_82_0-devel libboost_coroutine1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_chrono1_82_0-devel libboost_context1_82_0-devel libboost_coroutine1_82_0 libboost_headers1_82_0-devel libboost_thread1_82_0-devel libstdc++-devel"

inherit rpm
