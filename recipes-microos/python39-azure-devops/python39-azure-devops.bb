SUMMARY = "Python wrapper around the Azure DevOps 5x APIs"
DESCRIPTION = "Python wrapper around the Azure DevOps 5.x APIs"
LICENSE = "MIT"

PV = "7.1.0~b1"

RPM_NAME = "python39-azure-devops-7.1.0~b1-1.1.noarch.rpm"
RPM_HASH = "18352b14b28a7011dc1464db43b170dd6553f87c7d7280333c38d71ed4fcbc8c0dc26e4538848e888d2ab04e5901a9a1b1f787632805af913cab9bbc6800efcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-devops) \
python39-azure-devops \
python39-vsts \
python3dist(azure-devops)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-nspkg \
python39-msrest"

inherit rpm
