SUMMARY = "Importing Python modules by physical file path"
DESCRIPTION = "Importing Python modules by physical file path."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-magicalimport-0.9.1-2.8.noarch.rpm"
RPM_HASH = "b8a2e0ab1c06b411d2e5039607dd6e642174480005850790bc093b337ac7f1fd735968f1d469dea9ddc03c4d1f16a69b5a6613ff662a7097e6f9c4447368ca13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(magicalimport) \
python311-magicalimport \
python3dist(magicalimport)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
