SUMMARY = "Health-checker plugins for SUSE CaaS Platform"
DESCRIPTION = "This package contains health-checker plugins for testing that \
the SUSE CaaS Platform did boot correctly."
LICENSE = "GPL-2.0-only"

PV = "1.8"

RPM_NAME = "health-checker-plugins-caasp-1.8-1.1.noarch.rpm"
RPM_HASH = "62d4a0d6b3dd12b781b241287647afbd8673d9088f36a6671c5892ef74178f50ecdf0046f2a1a4b33f03beeb33475419fab7374c7f631eef206e0966bb5e8295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins health-checker-plugins-caasp"
RDEPENDS:${PN} += "/bin/bash health-checker"

inherit rpm
