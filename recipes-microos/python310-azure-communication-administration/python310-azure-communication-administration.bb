SUMMARY = "Microsoft Azure Communication Administration Service Client Library for Python"
DESCRIPTION = "Azure Communication Administration client package is intended to be used to setup the basics for opening a way to use \
Azure Communication Service offerings. This package helps to create identities user tokens to be used by other client \
packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python310-azure-communication-administration-1.0.0b4-1.8.noarch.rpm"
RPM_HASH = "1f6ac23482fcb72f5ecca5c05519d9ff18e2c6e89bfde28f0af7dfc867aab9247274bc924c37bf07cdbb698c2586a8518e18f2ebdf6ecebab55d5099d0805d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-administration \
python3.10dist(azure-communication-administration) \
python310-azure-communication-administration \
python3dist(azure-communication-administration)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest"

inherit rpm
