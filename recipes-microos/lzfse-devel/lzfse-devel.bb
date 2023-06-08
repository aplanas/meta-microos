SUMMARY = "Reference C implementation of the LZFSE compressor"
DESCRIPTION = "LZFSE is a Lempel-Ziv style data compression algorithm using Finite State \
Entropy coding. It targets similar compression rates at higher compression \
and decompression speed compared to deflate using zlib. \
 \
This package contains devel files."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "lzfse-devel-1.0-2.11.aarch64.rpm"
RPM_HASH = "95b40509e1caacde93c060b678ca123276f28d4d7163f1911e37e8d7e382f94770a27086635c66805cc7640e8b667c7b14514bbd2f33e98caa553cc90a72d57d"

RPROVIDES:${PN} += "lzfse-devel lzfse-devel(aarch-64)"
RDEPENDS:${PN} += "lzfse"

inherit rpm
