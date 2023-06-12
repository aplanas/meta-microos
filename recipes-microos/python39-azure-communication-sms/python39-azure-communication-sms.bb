SUMMARY = "Microsoft Azure Communication SMS Client Library for Python"
DESCRIPTION = "Azure Communication SMS client package is intended to be used to send SMS using an Azure Resource."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-azure-communication-sms-1.0.1-1.8.noarch.rpm"
RPM_HASH = "a5e1db75493a0523d1e82a404a65947bb7151ed0f9e6fdc2d994725c19716e9fcc584943a931f8d0a0cd756c35b04f4978d535a8a3817ca9e41f7ccc61a9283c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-communication-sms) \
python39-azure-communication-sms \
python3dist(azure-communication-sms)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest \
python39-six"

inherit rpm
