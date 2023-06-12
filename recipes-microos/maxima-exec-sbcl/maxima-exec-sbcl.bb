SUMMARY = "Maxima compiled with SBCL"
DESCRIPTION = "Maxima compiled with SBCL."
LICENSE = "GPL-2.0-or-later"

PV = "5.46.0"

RPM_NAME = "maxima-exec-sbcl-5.46.0-1.20.aarch64.rpm"
RPM_HASH = "bdcdd1328c93642b4e95f3adb28ed8269b38f195105d7c2e3384ee27646608b5c64b32c7a866779c8980224ff03a1f0bf83a2b345d9d708e07ed47260e96c8f9"

RPROVIDES:${PN} += "maxima-exec-sbcl \
maxima-exec-sbcl(aarch-64) \
maxima_exec"
RDEPENDS:${PN} += "sbcl"

inherit rpm
