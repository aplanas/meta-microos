SUMMARY = "Image management utilities for AWS EC2"
DESCRIPTION = "A collection of image manipulation utilities for AWS EC2. These include: \
- ec2deprecateimg: Deprecates images by applying tags per convention \
- ec2publishimg: Set image visibility \
- ec2uploadimg: Upload an image to AWS EC2"
LICENSE = "GPL-3.0+"

PV = "10.0.1"

RPM_NAME = "python3-ec2imgutils-10.0.1-1.4.noarch.rpm"
RPM_HASH = "ad88a9ce7569af88416cc849a59153b4a07913bdba64d80bd15650e57cd80782bbea30a0a7447f6f3fd320927a71c2818a981d2ce85917bb1fd00f16528bd1fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ec2deprecateimg python-ec2publishimg python-ec2uploadimg python-ec2utilsbase python3-ec2deprecateimg python3-ec2imgutils python3-ec2publishimg python3-ec2uploadimg python3-ec2utilsbase python3.10dist(ec2imgutils) python3dist(ec2imgutils)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3 python3-boto3 python3-dateutil python3-paramiko"

inherit rpm
