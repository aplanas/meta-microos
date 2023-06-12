SUMMARY = "SpiderLabs Research (SLR) rules for OWASP ModSecurity CRS"
DESCRIPTION = "SpiderLabs Research rules for ModSecurity CRS"
LICENSE = "Apache-2.0"

PV = "2.2.9"

RPM_NAME = "owasp-modsecurity-crs-slr_rules-2.2.9-3.8.noarch.rpm"
RPM_HASH = "7b9917881679d985d6fe07672774da0edfdf953bc81762d3f05f85bdc3436ab977364f0ea0e91e817141ea222d0fff8bdc7d94bb39cc847dd923fd93c799ac8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(owasp-modsecurity-crs-slr_rules) \
owasp-modsecurity-crs-slr_rules"
RDEPENDS:${PN} += "owasp-modsecurity-crs"

inherit rpm
