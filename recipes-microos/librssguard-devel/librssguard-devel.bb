SUMMARY = "Development headers for librssguard-4_3_4"
DESCRIPTION = "Development headers to be used with librssguard-4_3_4."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-only"

PV = "4.3.4"

RPM_NAME = "librssguard-devel-4.3.4-1.1.aarch64.rpm"
RPM_HASH = "2e8a09704605f93e8a19ba076536a80616d8b9b00640f53a3c4c13525ae5cbf5f11143e971fd2ad784c80121e13501db1baf5537ee143f6cb283e1eed4f4ee68"

RPROVIDES:${PN} += "librssguard-devel \
librssguard-devel(aarch-64)"
RDEPENDS:${PN} += "librssguard-4_3_4"

inherit rpm
