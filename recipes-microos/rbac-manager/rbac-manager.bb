SUMMARY = "Kubernetes operator for easier RBAC management"
DESCRIPTION = "RBAC Manager is designed to simplify authorization in Kubernetes. \
This is an operator that supports declarative configuration for RBAC with new custom resources. \
Instead of managing role bindings or service accounts directly, you can specify a desired state and RBAC Manager will make the necessary changes to achieve that state."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "rbac-manager-1.4.2-1.3.aarch64.rpm"
RPM_HASH = "33b857e504e33e7235da8c22f3e879427922d24ad2a01d1b84f7aeb3883a6a1d377507aace4f301dff1abe1f58f295b96ba5cb77df9a73bd5ae69abedfd5875e"

RPROVIDES:${PN} += "rbac-manager rbac-manager(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
