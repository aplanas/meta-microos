SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-azure-mgmt-recoveryservices-2.3.0-1.3.noarch.rpm"
RPM_HASH = "9c95062f8aafdd70ed354337c82a1ebfb2cb518bc5ae82d142aa7f8da3cdcbd73e42b147918c279fdf8942b7773f9d8b289b3daa633df08e7ecf593a51d14536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-recoveryservices) python39-azure-mgmt-recoveryservices python3dist(azure-mgmt-recoveryservices)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
