SUMMARY = "Python coverage plugin to provide default settings"
DESCRIPTION = "Python coverage plugin to provide default settings."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-covdefaults-2.3.0-1.2.noarch.rpm"
RPM_HASH = "f489f46f88dce564940c052023be0da5fce3089d4ee4d8be9f9e1a9cb506337962daeb4002a29efe5249367541720b3f9acb4b5fdc429ba5a0663ac56152b7f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-covdefaults \
python3.10dist(covdefaults) \
python310-covdefaults \
python3dist(covdefaults)"
RDEPENDS:${PN} += "python(abi) \
python310-coverage"

inherit rpm
