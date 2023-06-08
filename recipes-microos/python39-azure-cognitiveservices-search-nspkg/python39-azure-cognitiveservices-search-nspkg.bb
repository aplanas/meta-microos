SUMMARY = "Microsoft Azure Cognitive Services Search namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Search namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.search namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-azure-cognitiveservices-search-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "ba8f66ba394ada7db15d214c9ec0fe902ad8fc8e89ddfc018780fec834c24264fe278ef80b2c82af5399da17cb551d9b1a4600794fe9d54d0dfe734d21c396a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-search-nspkg) python39-azure-cognitiveservices-search-nspkg python3dist(azure-cognitiveservices-search-nspkg)"
RDEPENDS:${PN} += "python39-azure-cognitiveservices-nspkg python39-azure-nspkg"

inherit rpm
