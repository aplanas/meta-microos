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

RPM_NAME = "python39-azure-search-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "e6ae3b18eccb598161a951d84ea48c9e64e052f707cd5b815d8abfeded7d88890c38a4fdccfe48b24ad721134855baa29705d9e6f77ab24cb84b3fde54e75323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-search-nspkg) \
python39-azure-search-nspkg \
python3dist(azure-search-nspkg)"
RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
