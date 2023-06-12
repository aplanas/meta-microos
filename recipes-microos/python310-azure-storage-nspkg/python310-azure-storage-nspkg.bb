SUMMARY = "Microsoft Azure Storage namespace package"
DESCRIPTION = "This is the Microsoft Azure Storage namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.storage namespace."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-azure-storage-nspkg-3.1.0-2.11.noarch.rpm"
RPM_HASH = "44a18d1554985ddc8b1e86efcbdc237745fcb683a5edd90f8fa3e4e7e24a99364fe735442936358cc0992c324f02370e34c8b3437f14e4c7958de8c008b9ce62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-nspkg \
python3.10dist(azure-storage-nspkg) \
python310-azure-storage-nspkg \
python3dist(azure-storage-nspkg)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-nspkg"

inherit rpm
