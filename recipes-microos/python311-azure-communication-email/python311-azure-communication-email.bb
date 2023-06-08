SUMMARY = "Azure Communication Email client library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Email. \
Key concepts \
 \
The Azure Communication Email package is used to do following: \
 \
 * Send emails to multiple types of recipients \
 * Query the status of a sent email message"
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-communication-email-1.0.0.0-1.2.noarch.rpm"
RPM_HASH = "add03c25103f085f38b03360b1a887b72f920ea7eae82eb8043d1c3766f729cf4298e091e67125019f641f5ddbec6fdd4367e39cdf03329ee5baa2c70dee4235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-communication-email) python311-azure-communication-email python3dist(azure-communication-email)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-communication-nspkg python311-azure-core python311-azure-nspkg python311-msrest"

inherit rpm
