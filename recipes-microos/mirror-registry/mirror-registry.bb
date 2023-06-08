SUMMARY = "Tool helping to mirror a registry to a private one"
DESCRIPTION = "mirror-registry will analyse a remote registry and create a yaml file with all containers and tags matching a regex to sync with skopeo to a private registry. While this tool understands the architecture flag for containers, skopeo does not really use this information yet. If a repository contains multi-arch containers, it will fail if there is no container for the architecture it is running on, else it will use the architecture which it is running on."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "mirror-registry-1.4-1.1.aarch64.rpm"
RPM_HASH = "51c3bd4c9b6712c47f4decae76ec682f7afdfacb889a29a32e0f6cc03c76d20fed848168efa0dc40d51288f361e778d965614d75a86f979fb07c2041bed10e4a"

RPROVIDES:${PN} += "mirror-registry mirror-registry(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) skopeo"

inherit rpm
