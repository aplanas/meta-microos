SUMMARY = "Microsoft Azure Cognitive Services Knowledge namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Knowledge namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.knowledge namespace."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-azure-cognitiveservices-knowledge-nspkg-3.0.0-4.9.noarch.rpm"
RPM_HASH = "b9d196fff0bb6c44a9acd643927138591d66a3083a7bd2200c1b3316c4930e01c3f4ebd11520b3961c11ea8bb18c13bf30b9f5b67c9377f404a024b08341da2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-knowledge-nspkg python3.10dist(azure-cognitiveservices-knowledge-nspkg) python310-azure-cognitiveservices-knowledge-nspkg python3dist(azure-cognitiveservices-knowledge-nspkg)"
RDEPENDS:${PN} += "python310-azure-cognitiveservices-nspkg python310-azure-nspkg"

inherit rpm
