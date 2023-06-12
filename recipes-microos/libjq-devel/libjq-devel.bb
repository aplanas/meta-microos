SUMMARY = "Development files for jq"
DESCRIPTION = "Development files (headers and libraries for jq)."
LICENSE = "CC-BY-3.0 & MIT"

PV = "1.6"

RPM_NAME = "libjq-devel-1.6-3.3.aarch64.rpm"
RPM_HASH = "849e3631074705de73bccd71cd930743112d6cc759af1a4a39a7ee3644bd6ff48544548f9b99795f2de44ebe496afae50bc2f03ce8e6e4696bb192a68f06ab30"

RPROVIDES:${PN} += "libjq-devel \
libjq-devel(aarch-64)"
RDEPENDS:${PN} += "libjq1"

inherit rpm
