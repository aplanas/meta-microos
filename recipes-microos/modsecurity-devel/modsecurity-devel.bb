SUMMARY = "Development files for modsecurity, a web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control. \
 \
This subpackage holds the development headers for the library."
LICENSE = "BSD-2-Clause"

PV = "3.0.9"

RPM_NAME = "modsecurity-devel-3.0.9-1.1.aarch64.rpm"
RPM_HASH = "89a8b432b9275651cea97e5b6ba562d660960afb54964fdaa78488e8d361209cf75ec463a97955a48016224c6304b6c5102bc19f32f5e78ec6cf0d79feff367b"

RPROVIDES:${PN} += "modsecurity-devel modsecurity-devel(aarch-64) pkgconfig(modsecurity)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmodsecurity3"

inherit rpm
