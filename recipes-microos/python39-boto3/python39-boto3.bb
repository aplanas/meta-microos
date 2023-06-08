SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.26.115"

RPM_NAME = "python39-boto3-1.26.115-1.1.noarch.rpm"
RPM_HASH = "3fb1fe8469c94f948c662e014d71fba02f3a6488c2bcaf1c99f999a9240cf7f22ba405324c3468fb31f7f30ee950c327fab7f8b9cec0039b81116bab9784bce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(boto3) python39-boto3 python3dist(boto3)"
RDEPENDS:${PN} += "python(abi) python39-botocore python39-jmespath python39-s3transfer"

inherit rpm
