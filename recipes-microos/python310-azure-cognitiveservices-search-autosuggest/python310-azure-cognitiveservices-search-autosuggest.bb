SUMMARY = "Microsoft Azure Auto Suggest Client Library"
DESCRIPTION = "This is the Microsoft Azure Auto Suggest Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-azure-cognitiveservices-search-autosuggest-0.2.0-2.11.noarch.rpm"
RPM_HASH = "74c52037e82ad838449458f494f4bb65283ed0b1106fafcbc052ccda9653bafd1a7e107372a08c5c9eb512aec3cbe59c6657bb3cb59e19663a3e8db9b48706d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-autosuggest \
python3.10dist(azure-cognitiveservices-search-autosuggest) \
python310-azure-cognitiveservices-search-autosuggest \
python3dist(azure-cognitiveservices-search-autosuggest)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
