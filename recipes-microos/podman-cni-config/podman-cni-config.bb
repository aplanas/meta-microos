SUMMARY = "Basic CNI configuration for podman"
DESCRIPTION = "A 'basic' CNI configuration for podman that makes networking usable for basic \
setups. In more complicated setups, users are recommended to write their own \
CNI configurations."
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "podman-cni-config-4.5.1-1.1.noarch.rpm"
RPM_HASH = "ad4caaa08387f7ae26699dbc3dac431a4843a862ed84dddd1d267dac772991d46fee19d5448304fddb39be693ea25d911e52a627bde0ba3b311f3c71eaa77559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-cni-config"
RDEPENDS:${PN} += "iproute2 podman"

inherit rpm
