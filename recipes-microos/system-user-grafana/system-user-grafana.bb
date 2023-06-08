SUMMARY = "System user and group 'grafana'"
DESCRIPTION = "This package provides a shared system user for all grafana components"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-grafana-1.0.0-1.8.noarch.rpm"
RPM_HASH = "2a3b83e3f6aa246883b54404aa3ad16f0e9264f6f4b54abb65fc5587a678a1e24eb0e87866adcbe06f2e05cf2618ba5a0364b04e9b3feb5ede3143ecd81b9870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(grafana) system-user-grafana user(grafana)"
RDEPENDS:${PN} += "/bin/sh sysuser-shadow"

inherit rpm
