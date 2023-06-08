SUMMARY = "Documentation for qt6-quickeffectmaker in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quickeffectmaker in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quickeffectmaker-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "247b97525bed73f312dc4f18bf46ea149c950c5797832943e9dd15396eb261b447c87cf2e755d98cfdb4b7718aa6f799be5184b0cc9ed8a6ccb293ae73d77377"

RPROVIDES:${PN} += "qt6-quickeffectmaker-docs-qch qt6-quickeffectmaker-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
