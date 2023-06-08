SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes-client-1.27.1-30.1.aarch64.rpm"
RPM_HASH = "394bf0134a85659e315e249100dad6ea11ec1fb60930fddf85996bedace7346c688efe525bb19ba4e9b9f95396b7e09371e9adadffe3cdeaca107f32a0cb3b75"

RPROVIDES:${PN} += "kubernetes-client kubernetes-client(aarch-64)"
RDEPENDS:${PN} += "kubernetes1.27-client"

inherit rpm
