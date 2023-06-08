SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.26.115"

RPM_NAME = "python311-boto3-1.26.115-1.1.noarch.rpm"
RPM_HASH = "b286065bfcc9135ce2fd3f8da72a58f688e86e6564e4bf7487be48603cadcfa8769ecd0959852919f35b83def71db8ba8f9124bad42d9dbe94ab74a2e23ae345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(boto3) python311-boto3 python3dist(boto3)"
RDEPENDS:${PN} += "python(abi) python311-botocore python311-jmespath python311-s3transfer"

inherit rpm
