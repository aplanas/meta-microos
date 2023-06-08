SUMMARY = "A British words dictionary"
DESCRIPTION = "This package contains a British words dictionary which will be installed as \
 \
/usr/share/dict/british \
 \
For a description see the package words."
LICENSE = "SUSE-Public-Domain"

PV = "2020.12.07"

RPM_NAME = "words-british-2020.12.07-2.1.noarch.rpm"
RPM_HASH = "1c015754c63fe2397cb106dc39981ca0ec5a236d004f6b9e883712590e47701450469bd58fa6b2c15981be14626027ca7c04756f0719493b07c96c982d353fbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "words-british"
RDEPENDS:${PN} += "words"

inherit rpm
