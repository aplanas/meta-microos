SUMMARY = "Microsoft Azure Cognitive Services Knowledge namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Knowledge namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.knowledge namespace."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-azure-cognitiveservices-knowledge-nspkg-3.0.0-4.9.noarch.rpm"
RPM_HASH = "04f6537bfa9b7be8996b139070879e432782e1ab21cbd570b3ce28b38aa69d08fe12c4628e4dba403ad2d58cc7970db379c8f493f5a8a6394e813e9298f591f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-knowledge-nspkg) python39-azure-cognitiveservices-knowledge-nspkg python3dist(azure-cognitiveservices-knowledge-nspkg)"
RDEPENDS:${PN} += "python39-azure-cognitiveservices-nspkg python39-azure-nspkg"

inherit rpm
