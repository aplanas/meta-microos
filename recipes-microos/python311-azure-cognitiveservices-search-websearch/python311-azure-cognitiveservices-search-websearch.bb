SUMMARY = "Microsoft Azure Cognitive Services WebSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Web Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-cognitiveservices-search-websearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "ace38cf10bac81bd4a81de7aecc8b67e79932f0e757a501f6f66bd626958961252147e1fd86ff133d28dcae48072ae1438929037d5a7efdf2194abd5559f0287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-search-websearch) \
python311-azure-cognitiveservices-search-websearch \
python3dist(azure-cognitiveservices-search-websearch)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
