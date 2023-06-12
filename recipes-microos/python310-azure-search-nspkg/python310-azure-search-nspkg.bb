SUMMARY = "Microsoft Azure Search Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Search namespace package. It isn't intended to be \
installed directly. Search client libraries are located elsewhere: \
 \
* azure-search-documents \
 \
This package is for Python 2 only. It provides the necessary files for other packages \
to extend the azure namespace. Python 3.x libraries use PEP420 instead."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-search-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "b3603315743ef2e6d2da91ab5b0fba6d366a28c98e8e3c4f46d933410751ad332c214d59ed8b79968ff60a4b1218c5c014947343e50d891b6906546c518e3083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-search-nspkg \
python3.10dist(azure-search-nspkg) \
python310-azure-search-nspkg \
python3dist(azure-search-nspkg)"
RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
