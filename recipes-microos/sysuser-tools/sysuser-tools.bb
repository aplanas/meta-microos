SUMMARY = "Auto provides for system users"
DESCRIPTION = "Generate auto provides for system users."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "sysuser-tools-3.1-5.3.noarch.rpm"
RPM_HASH = "85e647abb28df409d4a49d2953dfc52a260545ab294da3056d07a780673f8591e7055e15b39b882b9f0ac20f0ed999c8ef82e72cf5a225192823300f33e698ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm_macro(sysusers_generate_pre) rpm_macro(sysusers_requires) sysuser-tools"
RDEPENDS:${PN} += "/bin/bash sysuser-shadow"

inherit rpm
