SUMMARY = "Microsoft Azure Security Center Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Security Center Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python39-azure-mgmt-security-5.0.0-1.1.noarch.rpm"
RPM_HASH = "698afdeec99818f60e85e5800501224fef5fc794f4fff2e8f668e76d04cb63ed5c7f7a5150d8e4ef1abd573ab0681314924ae2daee42cab5ca4065d523caaef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-security) python39-azure-mgmt-security python3dist(azure-mgmt-security)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
