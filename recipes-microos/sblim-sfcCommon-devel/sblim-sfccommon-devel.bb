SUMMARY = "Library of utility functions shared between sfcb and sfcc"
DESCRIPTION = "This package provides development files to compile and link against \
libsblim-sfccommon."
LICENSE = "EPL-1.0"

PV = "1.0.1"

RPM_NAME = "sblim-sfcCommon-devel-1.0.1-3.24.aarch64.rpm"
RPM_HASH = "f71baa71321eba07fb7cf56ff34d7a92137e894d1b43ea70ea86d63665634cc1aea4728192fd030c231c85c7bea524ab590369c0b3ce7062471e07170a73d312"

RPROVIDES:${PN} += "sblim-sfcCommon-devel sblim-sfcCommon-devel(aarch-64)"
RDEPENDS:${PN} += "libsfcUtil0 pkgconf-pkg-config sblim-cmpi-devel"

inherit rpm
