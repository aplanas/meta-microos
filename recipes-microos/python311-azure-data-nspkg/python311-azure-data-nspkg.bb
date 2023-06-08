SUMMARY = "Microsoft Azure Data Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Data namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.data namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-data-nspkg-1.0.0-2.11.noarch.rpm"
RPM_HASH = "dcdf6d85a004e1e09adfa2f8e81d0c46a37854e0752d58fffac86722fbb55aed26dca32508ec2c6585e618ff9658fdc51ace4790dfbf1f8ae8d48deaa554c474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-data-nspkg) python311-azure-data-nspkg python3dist(azure-data-nspkg)"
RDEPENDS:${PN} += "python(abi) python311-azure-nspkg"

inherit rpm
