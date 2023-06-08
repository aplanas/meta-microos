SUMMARY = "Development files for modsecurity, a web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control. \
 \
This subpackage holds the development headers for the library."
LICENSE = "BSD-2-Clause"

PV = "3.0.8"

RPM_NAME = "modsecurity-devel-3.0.8-1.4.aarch64.rpm"
RPM_HASH = "202845f381fc55acfed1ec7dfc32a5e46511fcf9ce8e52e6f53ab79a9e3816eef7622a30a207475b7261233dc47e2e4f6d1abea5fd26f222a47f321ea5a6e562"

RPROVIDES:${PN} += "modsecurity-devel modsecurity-devel(aarch-64) pkgconfig(modsecurity)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmodsecurity3"

inherit rpm
