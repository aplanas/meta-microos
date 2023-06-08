SUMMARY = "Health-checker plugins for SUSE CaaS Platform"
DESCRIPTION = "This package contains health-checker plugins for testing that \
the SUSE CaaS Platform did boot correctly."
LICENSE = "GPL-2.0-only"

PV = "1.7"

RPM_NAME = "health-checker-plugins-caasp-1.7-1.2.noarch.rpm"
RPM_HASH = "731f2c8bf53116d7b66dbeb7a4da70e7dcb4e5550982debbea60a18a581d1ebd8434d021b6c9a8fc5a201aff3b297ca20a524981c40d2be35aade68f8e144872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins health-checker-plugins-caasp"
RDEPENDS:${PN} += "/bin/bash health-checker"

inherit rpm
