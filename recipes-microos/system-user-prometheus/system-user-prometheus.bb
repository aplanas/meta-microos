SUMMARY = "System user and group 'prometheus'"
DESCRIPTION = "This package provides a shared system user for all Prometheus components \
like the Prometheus server itself and the Alertmanager"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-prometheus-1.0.0-1.8.noarch.rpm"
RPM_HASH = "89fe2ee4bc8887bbdeb2723156a3474043377196a28faaec2163ccdee62281794828baa4f2f2363a04e92f2659819b88a6860003005cb4bf8a9513c52d83e5a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(prometheus) system-user-prometheus user(prometheus)"
RDEPENDS:${PN} += "/bin/sh sysuser-shadow"

inherit rpm
