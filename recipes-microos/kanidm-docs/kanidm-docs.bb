SUMMARY = "Documentation for Kanidm Administration"
DESCRIPTION = "Documentation for using and configuring Kanidm."
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha11~git0.d3a2a6b"

RPM_NAME = "kanidm-docs-1.1.0~alpha11~git0.d3a2a6b-3.1.aarch64.rpm"
RPM_HASH = "22abc71ce456289ead4e3df6e1f157ca4c44e844ec59a86e5a72e9f1f41c8e8436ff9a3513cf9afea8d1d475fd7cd7f21dfb70f9ebaf8c2caa7b4ddf59d55979"

RPROVIDES:${PN} += "kanidm-docs kanidm-docs(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
