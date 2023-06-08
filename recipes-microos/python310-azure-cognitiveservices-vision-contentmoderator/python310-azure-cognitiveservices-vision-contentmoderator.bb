SUMMARY = "Microsoft Azure Cognitive Services Content Moderator Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Content Moderator Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-cognitiveservices-vision-contentmoderator-1.0.0-3.11.noarch.rpm"
RPM_HASH = "29180bbd6da0d7528a8f20b8d0f977c2e7564e4236149dbdaab313ecff9544dc5e31050971a666c48a7907b42a7cbca18ba68dc6def9a2690a8cd9c9f020f7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-contentmoderator python3.10dist(azure-cognitiveservices-vision-contentmoderator) python310-azure-cognitiveservices-vision-contentmoderator python3dist(azure-cognitiveservices-vision-contentmoderator)"
RDEPENDS:${PN} += "python(abi) python310-azure-cognitiveservices-nspkg python310-azure-cognitiveservices-vision-nspkg python310-azure-common python310-azure-nspkg python310-msrest"

inherit rpm
