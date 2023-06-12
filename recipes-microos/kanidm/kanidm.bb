SUMMARY = "A identity management service and clients."
DESCRIPTION = "An identity management platform written in rust that supports RADIUS, SSH Key management \
and more."
LICENSE = "( Apache-2.0 | BSL-1.0 ) & ( Apache-2.0 | ISC | MIT ) & ( Apache-2.0 | MIT ) & ( Apache-2.0-WITH-LLVM-exception | Apache-2.0 | MIT ) & ( CC0-1.0 | Apache-2.0 ) & ( MIT | Apache-2.0 | Zlib ) & ( Unlicense | MIT ) & ( Zlib | Apache-2.0 | MIT ) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT & MPL-2.0 & MPL-2.0+"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-1.1.0~alpha12~git0.bcdbb18-1.1.aarch64.rpm"
RPM_HASH = "adf71370fd6a9b8f81cdf16f27f4eb893a7e4e81d4f7ed9c78f0b3127ab53b91d08af13785e9553047ab235301bb051c08a90246361d148c9c7b3f176c12adc2"

RPROVIDES:${PN} += "kanidm \
kanidm(aarch-64)"
RDEPENDS:${PN} += "kanidm-clients \
kanidm-unixd-clients"

inherit rpm
