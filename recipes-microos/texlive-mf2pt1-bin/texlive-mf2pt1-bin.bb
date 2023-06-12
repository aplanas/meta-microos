SUMMARY = "Binary files of mf2pt1"
DESCRIPTION = "Binary files of mf2pt1"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23406"

RPM_NAME = "texlive-mf2pt1-bin-2023.20230311.svn23406-91.1.aarch64.rpm"
RPM_HASH = "ca18b7f900bb2d4cd5711d8b2dc88f59bc61bef301cd9b2fda2a7d2d481d70a82e2e02e66c1ba1d3f08fc01b6f500c7da95fbd1477b6e875607d06ed007589cb"

RPROVIDES:${PN} += "texlive-mf2pt1-bin texlive-mf2pt1-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mf2pt1"

inherit rpm
