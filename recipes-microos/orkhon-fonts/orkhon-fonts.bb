SUMMARY = "Font for Old Turkic Script"
DESCRIPTION = "Emir Yasin Sari's unicode font for writing Old turkic script."
LICENSE = "OFL-1.1"

PV = "20100509"

RPM_NAME = "orkhon-fonts-20100509-3.17.noarch.rpm"
RPM_HASH = "6e92c3c1710345b3f696872b1d9b96f1ec50e81bb8b8ece378caca58eae89710ef17072d1da541ee6932360f66ac766bb6a1ae81d4968df16ac55093f3a8dccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orkhon-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
