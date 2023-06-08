SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics in JSON format"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in JSON format."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2json-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "eb370792e59cfaa276c775d5797f7eb64e67af301164d61dcfd44e6381e2640f6dc63161d39ce01022913e769fde198d1f13d60b0880559a1c908ae54bad0198"

RPROVIDES:${PN} += "pcp-export-pcp2json pcp-export-pcp2json(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env libpcp3 python3-pcp"

inherit rpm
