SUMMARY = "Basic CNI configuration for podman"
DESCRIPTION = "A 'basic' CNI configuration for podman that makes networking usable for basic \
setups. In more complicated setups, users are recommended to write their own \
CNI configurations."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "podman-cni-config-4.5.0-1.1.noarch.rpm"
RPM_HASH = "743f6f552d9f26e3d42c54a7e8b0015f674ca839a691b8dd82419f14378bbf1923ba28b03856f8b18aa3cef4f805f8cf2884b8626d7279e6a8eba876ef03e4c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-cni-config"
RDEPENDS:${PN} += "iproute2 podman"

inherit rpm
