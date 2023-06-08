SUMMARY = "Icinga Web 2 vendor library lessphp"
DESCRIPTION = "Icinga Web 2 vendor library lessphp."
LICENSE = "MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-lessphp-2.11.4-1.1.noarch.rpm"
RPM_HASH = "66a843be20f1e6cef8f5d64b27e4d6d5f690091e1663dab7b22e30b8b935f58d1d9244b2437e0c53d77f1a977fb2ed2bfbd7695b02e070e9550df33419345ae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-lessphp"
RDEPENDS:${PN} += "/usr/bin/php icingaweb2-common php"

inherit rpm
