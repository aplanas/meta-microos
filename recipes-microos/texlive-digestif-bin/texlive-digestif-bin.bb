SUMMARY = "Binary files of digestif"
DESCRIPTION = "Binary files of digestif"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65210"

RPM_NAME = "texlive-digestif-bin-2023.20230311.svn65210-91.1.aarch64.rpm"
RPM_HASH = "cd292fb4694312ac635aced32fa421c1e523fb3543a9cfe15971185017112207bd11b2818689e5aa32b4d62bd03411db7b7911e1e8c8b67dc276b089ac969017"

RPROVIDES:${PN} += "texlive-digestif-bin texlive-digestif-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-digestif"

inherit rpm
