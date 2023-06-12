SUMMARY = "Documentation for qt6-lottie in QCH format"
DESCRIPTION = "This package contains documentation for qt6-lottie in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-lottie-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2a39595e69b97c134753263bf3e33e925a0b31195bf4738842ddf632d834fd26dab6df180e8c53a6d675599d58901457dbe61e8cd5b3d6245fc05d3eba5f985d"

RPROVIDES:${PN} += "qt6-lottie-docs-qch qt6-lottie-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
