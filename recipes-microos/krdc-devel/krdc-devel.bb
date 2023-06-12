SUMMARY = "Development files for krdc"
DESCRIPTION = "Development libraries and headers needed to build software using krdc"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "krdc-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "1a601b0a1d45603c3acbe242eb227365c59e8b7e6a4bb53e3eda59aa062f45d7d43b11d95874a35e61a2501f8d3ac624bcd4a02c1aaa259fa0521bbe89d6643e"

RPROVIDES:${PN} += "krdc-devel krdc-devel(aarch-64)"
RDEPENDS:${PN} += "krdc"

inherit rpm
