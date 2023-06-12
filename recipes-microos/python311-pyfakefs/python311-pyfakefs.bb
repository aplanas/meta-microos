SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.2.2"

RPM_NAME = "python311-pyfakefs-5.2.2-1.1.noarch.rpm"
RPM_HASH = "7b9f1a317c2fe99149efb4d1c338a4356db4a85758d4db78237d040db8076e5babf1c1d86da7496405d4714d5f2bde5211e81da1d02d9b39b52a02ae74dff410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyfakefs) \
python311-pyfakefs \
python3dist(pyfakefs)"
RDEPENDS:${PN} += "python(abi) \
python311"

inherit rpm
