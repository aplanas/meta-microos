SUMMARY = "A identity management service and clients."
DESCRIPTION = "An identity management platform written in rust that supports RADIUS, SSH Key management \
and more."
LICENSE = "( Apache-2.0 | BSL-1.0 ) & ( Apache-2.0 | ISC | MIT ) & ( Apache-2.0 | MIT ) & ( Apache-2.0-WITH-LLVM-exception | Apache-2.0 | MIT ) & ( CC0-1.0 | Apache-2.0 ) & ( MIT | Apache-2.0 | Zlib ) & ( Unlicense | MIT ) & ( Zlib | Apache-2.0 | MIT ) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT & MPL-2.0 & MPL-2.0+"

PV = "1.1.0~alpha11~git0.d3a2a6b"

RPM_NAME = "kanidm-1.1.0~alpha11~git0.d3a2a6b-3.1.aarch64.rpm"
RPM_HASH = "2271696c93393d6aebc7dbdb868916dd910630b99f8b9e2ff9e67e6e51d7cdf3501bbdb187721ecc978f2855379a85e0da1b4396170981d5158f039356609523"

RPROVIDES:${PN} += "kanidm kanidm(aarch-64)"
RDEPENDS:${PN} += "kanidm-clients kanidm-unixd-clients"

inherit rpm
