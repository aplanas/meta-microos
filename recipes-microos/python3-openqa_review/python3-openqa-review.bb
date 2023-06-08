SUMMARY = "A review helper script for openQA"
DESCRIPTION = "A review helper script for openQA. For more details look into the README file."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "python3-openqa_review-1.30.0-1.3.noarch.rpm"
RPM_HASH = "37271705a9fb2a690e0b0b2cea688fff66c326609cb5d0d4bb5caac59d40c653702daab926d92109fd596243135338daa4898ae8aee1e5d58ca23c5e5580894a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openqa_review python3.10dist(openqa-review) python3dist(openqa-review)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python(abi) python3-PyYAML python3-beautifulsoup4 python3-certifi python3-future python3-humanfriendly python3-pika python3-requests python3-setuptools python3-sortedcontainers update-alternatives"

inherit rpm
