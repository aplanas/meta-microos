SUMMARY = "Binary files of dviasm"
DESCRIPTION = "Binary files of dviasm"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn8329"

RPM_NAME = "texlive-dviasm-bin-2023.20230311.svn8329-89.1.aarch64.rpm"
RPM_HASH = "e135d9306499b0ea77277f01d56f0f9805193bea9ae70620ea288e467f6d36d331e5342ad5f2817da00efd0ad353053a69e5d3e889688cdb2583edb4201afac8"

RPROVIDES:${PN} += "texlive-dviasm-bin texlive-dviasm-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-dviasm"

inherit rpm
