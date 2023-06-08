SUMMARY = "Microsoft Azure Synapse Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Synapse namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.synapse namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-synapse-nspkg-1.0.0-2.11.noarch.rpm"
RPM_HASH = "14af10e43518caff1492d1fdbfe1ad963d07562a7bac9c93b589b97a41956e82f2560ccf9c1bb806f36ea84acfb1e3bb1d1f04578c56824090106a40e135fa00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse python3-azure-synapse-nspkg python3.10dist(azure-synapse-nspkg) python310-azure-synapse python310-azure-synapse-nspkg python3dist(azure-synapse-nspkg)"
RDEPENDS:${PN} += "python(abi) python310-azure-nspkg"

inherit rpm
