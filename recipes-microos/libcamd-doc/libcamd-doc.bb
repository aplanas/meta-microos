SUMMARY = "Documentation for libcamd"
DESCRIPTION = "Documentation for libcam."
LICENSE = "BSD-3-Clause"

PV = "5.13.0"

RPM_NAME = "libcamd-doc-5.13.0-49.1.aarch64.rpm"
RPM_HASH = "c3d2047adfc5af4972f16c060c2ad8c1f5aa632c8430199e2286f873486b2577c229b17d5a3a25e1c1f116da077237765b15d6cfc3a6a7bcf4b6401b5f8c3bb9"

RPROVIDES:${PN} += "libcamd-doc \
libcamd-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
