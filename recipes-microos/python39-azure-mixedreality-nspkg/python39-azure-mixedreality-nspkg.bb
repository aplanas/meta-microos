SUMMARY = "Microsoft Azure Mixed Reality Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mixedreality namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mixedreality-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "a386b6041d2b993c8945418b95df1d21ef218d761533ad5bc26b5f787417b3311c610d06aa8deb1a511c9f9f9a3afc94d91b496708bf6c6e596067d1271c66bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mixedreality-nspkg) \
python39-azure-mixedreality-nspkg \
python3dist(azure-mixedreality-nspkg)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-nspkg"

inherit rpm
