SUMMARY = "Kubernetes operator for easier RBAC management"
DESCRIPTION = "RBAC Manager is designed to simplify authorization in Kubernetes. \
This is an operator that supports declarative configuration for RBAC with new custom resources. \
Instead of managing role bindings or service accounts directly, you can specify a desired state and RBAC Manager will make the necessary changes to achieve that state."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "rbac-manager-1.4.2-1.4.aarch64.rpm"
RPM_HASH = "250d38cd901db51716f19f54885836be6b5ce393319c5715bdfe39cb93d2e22dcc00020e3fb35d62273f0ccf61f202973a4e5dcb3036493b42c215a2ef1b82de"

RPROVIDES:${PN} += "rbac-manager rbac-manager(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
