SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.26.115"

RPM_NAME = "python310-boto3-1.26.115-1.1.noarch.rpm"
RPM_HASH = "87d47cb57a4ee0c35c33ee72af8118f74dfabe3835459dd5b013f5770f8a1e22efa403c4e6cdd5e1fe8228978a72855d0134a8173ef1c82f7ff5ddf90dd0b2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-boto3 python3.10dist(boto3) python310-boto3 python3dist(boto3)"
RDEPENDS:${PN} += "python(abi) python310-botocore python310-jmespath python310-s3transfer"

inherit rpm
