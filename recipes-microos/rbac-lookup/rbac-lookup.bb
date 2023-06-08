SUMMARY = "Tool to find roles and cluster roles in a Kubernetes cluster"
DESCRIPTION = "RBAC Lookup is a CLI that allows you to easily find Kubernetes roles and cluster roles bound to any user, service account, or group name. \
Binaries are generated with goreleaser for each release for simple installation."
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "rbac-lookup-0.9.1-1.3.aarch64.rpm"
RPM_HASH = "ca65f29dea024d891edb72fed7229258b06b6b29bbfc5ea053a58704a26c04297282173547d2a74a0d8b6c5b1a631561af2f61aa03022b197a8fa4f31dc8806e"

RPROVIDES:${PN} += "rbac-lookup rbac-lookup(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
