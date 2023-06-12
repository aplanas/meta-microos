SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-client-1.24.13-2.2.aarch64.rpm"
RPM_HASH = "26ac7aa78366d127c9505ebf0b510638a4e42b6e1d4e71b3298c57ca3d81531a32349e05493ad2b0b3f1900149bdd0fa02f10350093b9325d147ec5e0132fc1b"

RPROVIDES:${PN} += "kubernetes-client-provider kubernetes1.24-client kubernetes1.24-client(aarch-64)"
RDEPENDS:${PN} += "kubernetes1.24-client-common update-alternatives"

inherit rpm
