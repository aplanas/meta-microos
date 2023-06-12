SUMMARY = "Microsoft Azure Management Core Library"
DESCRIPTION = "This is the Microsoft Azure Management Core Library. \
 \
Azure management core library defines extensions to Azure Core that are specific \
to ARM (Azure Resource Management) needed when you use client libraries. \
 \
As an end user, you don't need to manually install azure-mgmt-core because it will \
be installed automatically when you install other SDKs."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-azure-mgmt-core-1.4.0-1.1.noarch.rpm"
RPM_HASH = "b59cdb25a3da23cb8d4b2fa98ddec4cdd0a8dfd124137236017cda47d88e7535d27e00d83ec560d7073931746c117a7cf6a9dfa45d257d0a0fa381185caff658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-core) \
python39-azure-mgmt-core \
python3dist(azure-mgmt-core)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg"

inherit rpm
