SUMMARY = "Development Files for Musepack"
DESCRIPTION = "This package includes development files for musepack."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later & Zlib"

PV = "r475"

RPM_NAME = "musepack-devel-r475-4.11.aarch64.rpm"
RPM_HASH = "5f42e8c8575569d4cfc30dfeae0ebb7ef725e941e62f79ddedb369fd1b6eee066342008fbea3f2108af9cb5ea363ed6b5c2bdb551260be086816abbb9e104f99"

RPROVIDES:${PN} += "musepack-devel musepack-devel(aarch-64)"
RDEPENDS:${PN} += "libmpcdec6"

inherit rpm
