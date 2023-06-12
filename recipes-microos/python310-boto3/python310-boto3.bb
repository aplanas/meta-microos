SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.26.144"

RPM_NAME = "python310-boto3-1.26.144-1.1.noarch.rpm"
RPM_HASH = "6f1cbe0b557817903d58e4006fbfb1382a967db855baf77cf980d36c5ef5a79525b10cd8d0fea8c97bb362c75a0c68b3b8849943d4e98f4538ede6dc8d1cfb5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-boto3 python3.10dist(boto3) python310-boto3 python3dist(boto3)"
RDEPENDS:${PN} += "python(abi) python310-botocore python310-jmespath python310-s3transfer"

inherit rpm
