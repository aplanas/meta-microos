SUMMARY = "Microsoft Azure Kubernetes Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kubernetes Configuration Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-kubernetesconfiguration-2.0.0-1.6.noarch.rpm"
RPM_HASH = "d28f85c571309e06eeb79c8f2e90dee202e4f47fcf375f4bf87c4f3feb27c6c528e7eb9587fff199222e9bb999398698af436205cae7b26a45787598b95bb06b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-kubernetesconfiguration) python39-azure-mgmt-kubernetesconfiguration python3dist(azure-mgmt-kubernetesconfiguration)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
