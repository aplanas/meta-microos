SUMMARY = "Microsoft Azure Communication Administration Service Client Library for Python"
DESCRIPTION = "Azure Communication Administration client package is intended to be used to setup the basics for opening a way to use \
Azure Communication Service offerings. This package helps to create identities user tokens to be used by other client \
packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-communication-administration-1.0.0b4-1.8.noarch.rpm"
RPM_HASH = "3ab27f939bcb151b4eec7566ac5bc0fa3304e2f95db8035445a5db23b69c40dc68f60d00c4da3e9aa47e8da464d12f6764beb9dbbb787dbf96eb7e6e8aba3ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-communication-administration) python311-azure-communication-administration python3dist(azure-communication-administration)"
RDEPENDS:${PN} += "python(abi) python311-azure-communication-nspkg python311-azure-core python311-azure-nspkg python311-msrest"

inherit rpm
