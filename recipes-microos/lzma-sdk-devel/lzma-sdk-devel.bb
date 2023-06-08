SUMMARY = "Development libraries and headers for lzma-sdk"
DESCRIPTION = "This package contains development libraries and headers for lzma-sdk."
LICENSE = "LGPL-2.1-only"

PV = "22.01"

RPM_NAME = "lzma-sdk-devel-22.01-1.3.aarch64.rpm"
RPM_HASH = "904996d47fc8bdc5f307c99f0de5fcc8ed1c4885009b7344f55fd23a6215b287f1cd1f9cd0f7d7e50fb0568025c9636642ba606d98a3c94a4d5ab63d96746d67"

RPROVIDES:${PN} += "lzma-sdk-devel lzma-sdk-devel(aarch-64) pkgconfig(clzma)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libclzma-suse0"

inherit rpm
