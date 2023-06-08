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

RPM_NAME = "python38-azure-search-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "0694f5829d902ee732f28c0c87a5b19ec69297f14d210f730820b73fc33d616ef8eb52ffaf1231cfb4213fcac07ac1e0b56e40fd1b623f6165d582a6187ea3a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-search-nspkg) python38-azure-search-nspkg python3dist(azure-search-nspkg)"
RDEPENDS:${PN} += "python38-azure-nspkg"

inherit rpm
