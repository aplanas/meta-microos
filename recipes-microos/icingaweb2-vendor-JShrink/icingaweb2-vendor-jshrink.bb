SUMMARY = "Icinga Web 2 vendor library JShrink"
DESCRIPTION = "Icinga Web 2 vendor library JShrink."
LICENSE = "BSD-3-Clause"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-JShrink-2.11.4-1.1.noarch.rpm"
RPM_HASH = "5be7ced9cff8a1690b5a868a8f1159d330324e2d8d05c9fcad98e9df7d84d29909225c99c5f73b3c31de6825af317b59ceb5c20533733228b6186f62353b20a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-JShrink"
RDEPENDS:${PN} += "icingaweb2-common php"

inherit rpm
