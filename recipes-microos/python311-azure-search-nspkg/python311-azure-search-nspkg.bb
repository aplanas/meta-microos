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

RPM_NAME = "python311-azure-search-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "97484c75d253d156e0934f3334cf2eaa2fdebcbd0b1c9b80786903ea73ada37b52b305269375f6a409195822427d59e99d9c7a106880464859d49d6abd567e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-search-nspkg) python311-azure-search-nspkg python3dist(azure-search-nspkg)"
RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
