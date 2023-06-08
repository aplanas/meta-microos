SUMMARY = "Experimental rules for OWASP ModSecurity CRS"
DESCRIPTION = "Experimental rules for OWASP ModSecurity CRS"
LICENSE = "Apache-2.0"

PV = "2.2.9"

RPM_NAME = "owasp-modsecurity-crs-experimental_rules-2.2.9-3.8.noarch.rpm"
RPM_HASH = "e4be18b5534f9362f0be970ecdcf998077614def9df13b5a09d3f115b4ba85506dd928ca8abf4381db2f908e3315ef18f80112eb029a2daf13272db52d0650e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(owasp-modsecurity-crs-experimental_rules) owasp-modsecurity-crs-experimental_rules"
RDEPENDS:${PN} += "owasp-modsecurity-crs"

inherit rpm
