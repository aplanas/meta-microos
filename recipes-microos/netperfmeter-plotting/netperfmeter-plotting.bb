SUMMARY = "Network Performance Meter (plotting program)"
DESCRIPTION = "NetPerfMeter is a network performance meter for the UDP, \
TCP, MPTCP, SCTP and DCCP transport protocols over IPv4 and IPv6. \
It simultaneously transmits bidirectional flows to an endpoint \
and measures the resulting flow bandwidths and QoS. The \
results are written as vector and scalar files. The vector \
files can e.g. be used to create plots of the results. \
 \
This package contains a plotting program for the results."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0"

RPM_NAME = "netperfmeter-plotting-1.9.0-1.9.noarch.rpm"
RPM_HASH = "9a0b533bf8d3b1f8b8a711014c4739180fe7a3304430984bc20cd90d0fd60510fabeeab456a3980f89a5a1a9f4dbee804916bdf82d9cf93c20f3415fa77b31f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netperfmeter-plotting"
RDEPENDS:${PN} += "/bin/sh R-core netperfmeter netperfmeter-pdfproctools"

inherit rpm
