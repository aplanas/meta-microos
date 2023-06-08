SUMMARY = "Microsoft Azure Cognitive Services Content Moderator Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Content Moderator Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-cognitiveservices-vision-contentmoderator-1.0.0-3.11.noarch.rpm"
RPM_HASH = "01502c6f8d8b7a3c8e0833e8c3fdefb7a10d8bdae1bed07cc7639c4c56f6be76062c61706fbe61f04e65c2334242c5fcf9a5a4aec7412b402f6872417e9451f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-vision-contentmoderator) python311-azure-cognitiveservices-vision-contentmoderator python3dist(azure-cognitiveservices-vision-contentmoderator)"
RDEPENDS:${PN} += "python(abi) python311-azure-cognitiveservices-nspkg python311-azure-cognitiveservices-vision-nspkg python311-azure-common python311-azure-nspkg python311-msrest"

inherit rpm
