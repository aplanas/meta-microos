SUMMARY = "Type hints for NumPy"
DESCRIPTION = "Type hints for NumPy."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python311-nptyping-2.4.1-1.3.noarch.rpm"
RPM_HASH = "4560262ede0787cf5ae48632f8ba63c4c72b92b7637dfcda7580dcf45e7bf8e2e775c3c909c703cdd822a63ba8ae58d620d631f9b7a06ca7fe441e285300f81e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nptyping) \
python311-nptyping \
python3dist(nptyping)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy"

inherit rpm
