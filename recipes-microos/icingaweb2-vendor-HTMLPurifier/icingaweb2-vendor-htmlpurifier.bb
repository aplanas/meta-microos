SUMMARY = "Icinga Web 2 vendor library HTMLPurifier"
DESCRIPTION = "Icinga Web 2 vendor library HTMLPurifier."
LICENSE = "LGPL-2.1-only"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-HTMLPurifier-2.11.4-1.1.noarch.rpm"
RPM_HASH = "347efe48bb4af1b0e33492418030a12cf20a90545bd5890f02135c010d82bf815411b3ba7ecf888e2cfee2eab6a47a73903a870e9fe23ab1c0e9a5bbd33b81ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-HTMLPurifier"
RDEPENDS:${PN} += "icingaweb2-common php"

inherit rpm
